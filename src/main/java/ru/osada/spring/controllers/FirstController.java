package ru.osada.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Vladislav Osada
 * @date 27.04.2023 21:06
 */
@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name",required = false) String name,
                            @RequestParam(value = "surname",required = false) String surname) {

        System.out.println("Имя: " + name + " Фамилия: " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodBye() {
        return "first/goodbye";
    }
}
