package com.example.myfirstenternetproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {
    @GetMapping("/main")
    public String getMain(){
        return "main";
    }
}
