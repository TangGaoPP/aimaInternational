package com.example.aimcenter.Controller.ErrorController;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统报错统一处理
 * 2020年10月23日11:44:19
 * 汪涛
 */
@Controller
public class CommonErrorController  implements ErrorController {

    private final String ERROR_PATH = "/error";
    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    @RequestMapping(value = ERROR_PATH)
    public String handleError(){
        System.out.println(getErrorPath());
        return "/error/err1";
    }
}
