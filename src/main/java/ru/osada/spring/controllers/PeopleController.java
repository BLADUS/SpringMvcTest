package ru.osada.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.osada.spring.DAO.PersonDAO;

/**
 * @author Vladislav Osada
 * @date 29.04.2023 15:56
 */
@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PersonDAO personDAO;

    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }


    @GetMapping("/index")
    public String index(Model model) {
        //Получим всех людей изз DAO и передадим на отображение в представление
        model.addAttribute("people",personDAO.index());
        return "people/index";
    }

    //Можно поместить любое число которое перейдет в аргумент метода
    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        //Получим 1 человека по id из DAO и передадим а отображение в представление
       model.addAttribute("person", personDAO.show(id));
        return "people/show";
    }
}
