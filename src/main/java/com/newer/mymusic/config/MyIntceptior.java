package com.newer.mymusic.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.newer.mymusic.domain.ResponseDate;
import com.newer.mymusic.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

//自定义拦截器
@Component
public class MyIntceptior implements HandlerInterceptor {
    @Value("${auth.header}") //去application.yml 获取auth.header的值
    private String header;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入了preHandle的方法");
        String token = request.getHeader(header);
        try {
            if (token != null) {
                //从下标为7开始截取
                // token=token.substring(7);
                String UserName = jwtTokenUtil.getAnameByToken(token);
                if (UserName != null) {
                    return true;
                } else {
                    responseMsg(response);
                    return false;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            responseMsg(response);
        }
        responseMsg(response);
        return false;

    }

    //响应输出错误信息
    private void responseMsg(HttpServletResponse response){
        try{
            response.setContentType("application/json;charset=utf-8");
            PrintWriter out=response.getWriter();
            ResponseDate responseDate=new ResponseDate("403","fobidden");
            ObjectMapper objectMapper=new ObjectMapper();
            String  strDate = objectMapper.writeValueAsString(responseDate);

            out.print(strDate);
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("进入了postHandle的方法");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        System.out.println("进入了afterCompletion的方法");
    }
}
