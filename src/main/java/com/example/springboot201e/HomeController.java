package com.example.springboot201e;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadform")
    public String loadFormPage(){
        return "formtemplate";
    }

    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("login") String login,
                               @RequestParam("passwd") String password,
                               Model model) {
        model.addAttribute("loginval", login);
        model.addAttribute("passwordval", password);
        return "confirm";
    }
}
