package com.example.myfirstenternetproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SiteController {

    @GetMapping("/")
    public String getMain(){
        return "index";
    }
    @GetMapping("/contacts")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "contacts";
    }
    @GetMapping("/image")
    public String image(){
        return "image";
    }
}
