package com.example.aimcenter.Controller;

import com.example.aimcenter.dao.UserLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 页面跳转
 * 2020年10月23日11:45:02
 * 汪涛
 */
@Controller
public class PageController {

    @Autowired
    private UserLoginMapper userLoginMapper;
    /**
     * 首页
     * @return
     */
    @RequestMapping("/login")
    public String login_index(){
        return "login";
    }


    @RequestMapping("/loginBusiness")
    public String loginBusiness(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String,String> sessionmap = new HashMap<>();
        String login_id = request.getParameter("login_id");
        String psd = request.getParameter("password");

        BASE64Decoder decoder = new BASE64Decoder();
        String jmpsd = new String (decoder.decodeBuffer(psd));
        if(userLoginMapper.IsRegistera(login_id,jmpsd) > 0){
            HttpSession session = request.getSession(true);
            sessionmap.put("login_id",login_id);
            sessionmap.put("psd",jmpsd);
            session.setAttribute("usersession",sessionmap);
            return "/menu/menu";
        }else{

        System.out.println("@@@@@@@@@@@@@@"+login_id+"&&&"+psd);
        return "/login";
        }
    }

}
