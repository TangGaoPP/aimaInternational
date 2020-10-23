package com.example.aimcenter.Controller.Login;

import com.example.aimcenter.Controller.PageController;
import com.example.aimcenter.dao.UserLoginMapper;
import com.example.aimcenter.entitiy.UserLogin;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/aima")
public class LoginController {

    @Autowired
    private UserLoginMapper userLoginMapper;


    @GetMapping("getUserList")
    public List<UserLogin> getUserList(){
        return userLoginMapper.getUserList();
    }

    @GetMapping("/getUserByName")
    public String getUserByName(String loginid){
        System.out.println("*********"+userLoginMapper.getUserByName(loginid));
        return userLoginMapper.getUserByName(loginid);
    }


}
