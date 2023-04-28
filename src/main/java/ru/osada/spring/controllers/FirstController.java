package ru.osada.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
                            @RequestParam(value = "surname",required = false) String surname,
                            Model model) {

        model.addAttribute("userData","name: " + name + " surname: " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodBye() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") int a,
                             @RequestParam("b") int b,
                             @RequestParam("operator") String operator,
                             Model model){
        String result = null;
        switch (operator){
            case "addition":{
                result = String.valueOf(a + b);
                break;
            }
            case "multiplication":{
                result = String.valueOf(a*b);
                break;
            }
            case "subtraction":{
                result = String.valueOf(a-b);
                break;
            }
            case "division":{
                result = String.valueOf(a/b);
                break;
            }
            default:break;
        }
model.addAttribute("answer","Answer: " + result);

        return "/first/calculator";
    }
}
