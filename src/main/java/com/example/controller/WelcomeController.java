package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WelcomeController {

    @RequestMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable("num1") int num1, 
                               @PathVariable("num2") int num2, 
                               Model model) {
        model.addAttribute("addition", num1 + num2);
        model.addAttribute("subtraction", num1 - num2);
        model.addAttribute("multiplication", num1 * num2);
        model.addAttribute("division", num2 != 0 ? (double) num1 / num2 : "Division by zero error");
        return "calculate";
    }
}
