package com.example.webpll.controllers;

import com.example.webpll.models.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CalcController {
    @GetMapping("/calc")
    public String calculation(Model model) {
        model.addAttribute("title", "Main simulation");
        return "calc";
    }

    @PostMapping("/calc")
    public String jitterCalc(@RequestParam String UI, @RequestParam String Jdet,
                             @RequestParam String Jran, @RequestParam String Tsetup,
                             @RequestParam String Thold, Model model){
        Calculator calculator = new Calculator(UI, Jdet, Jran, Tsetup, Thold);
        System.out.println("HELLO HELLO HELLO !!!11111");
        calculator.calculateBER();
        return "";
    }

//    @GetMapping("/calc")
//    public String greetingForm(Model model) {
////        model.addAttribute("greeting", new Greeting());
//        return "greeting";
//    }
//
//    @PostMapping("/calc")
//    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
//        model.addAttribute("greeting", greeting);
//        System.out.println("HELLO HELLO HELLO !!!11111");
//        return "result";
//    }
}