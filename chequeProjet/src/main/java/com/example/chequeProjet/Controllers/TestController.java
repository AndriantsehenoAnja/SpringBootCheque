package com.example.chequeProjet.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public String message(){
        String a = "hello";
        return a;
    }
}
