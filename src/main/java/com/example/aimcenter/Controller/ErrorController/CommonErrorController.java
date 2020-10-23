package com.example.aimcenter.Controller.ErrorController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonErrorController  implements ErrorController {

    private final String ERROR_PATH = "/error";
    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    @RequestMapping(value = ERROR_PATH)
    public void handleError(){
        System.out.println(getErrorPath());
      //  HandleErrorController.handleError();
    }
}
