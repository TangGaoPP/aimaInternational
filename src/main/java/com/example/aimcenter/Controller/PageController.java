package com.example.aimcenter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    /**
     * 首页
     * @return
     */
    @RequestMapping("/login")
    public String login_index(){
        return "error/err1";
    }


}
