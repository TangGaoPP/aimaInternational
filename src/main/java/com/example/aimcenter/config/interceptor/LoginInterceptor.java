package com.example.aimcenter.config.interceptor;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

@Component
public class LoginInterceptor  implements HandlerInterceptor {

    Logger logger = Logger.getLogger(LoginInterceptor.class);

  private static final Set<String> WHITE_URI = new HashSet<>();


    static {
         WHITE_URI.add("/login");
         WHITE_URI.add("/loginBusiness");
         WHITE_URI.add("/static/**");
        WHITE_URI.add("/error");
    }

    /**
     * 进入Controller 前进行校验
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        System.out.println(session.getAttribute("usersession"));
        if(WHITE_URI.contains(request.getRequestURI())){

            logger.info("不拦截"+request.getRequestURI());
            return true;
        }else if(request.getSession().getAttribute("usersession") != null){
            logger.info("不拦截"+request.getRequestURI()+"-"+request.getSession().getAttribute("usersession"));
            return true;
        }else{
            logger.info("拦截到了"+request.getRequestURI());
            response.sendRedirect("/login");
            return false;
        }

    }

    /**
     * 此方法为处理请求之后调用（通过Controller方法之后，跳转视图之前）
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 此方法为整个请求结束之后进行调用
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
