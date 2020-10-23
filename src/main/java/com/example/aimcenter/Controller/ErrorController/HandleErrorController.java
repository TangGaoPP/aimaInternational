package com.example.aimcenter.Controller.ErrorController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HandleErrorController {

   @RequestMapping("/error1")
    public  String handleError(){
        return "err1";
    }
}
