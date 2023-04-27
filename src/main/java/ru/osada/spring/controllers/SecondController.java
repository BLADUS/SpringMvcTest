package ru.osada.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Vladislav Osada
 * @date 27.04.2023 21:20
 */
@Controller
@RequestMapping("/second")
public class SecondController {
    @GetMapping("/exit")
    public String sayExit(){
        return "exit";
    }
}
