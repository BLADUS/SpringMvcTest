package ru.osada.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Vladislav Osada
 * @date 27.04.2023 21:06
 */
@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(){
        return "first/hello";
    }
@GetMapping("/goodbye")
    public String goodBye(){
        return "first/goodbye";
    }
}
