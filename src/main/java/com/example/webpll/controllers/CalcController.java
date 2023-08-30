package com.example.webpll.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
    @GetMapping("/calc")
    public String calculation(Model model) {
        model.addAttribute("title", "Main simulation");
        return "calc";
    }
}