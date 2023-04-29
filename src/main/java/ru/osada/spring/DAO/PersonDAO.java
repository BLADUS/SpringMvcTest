package ru.osada.spring.DAO;

import org.springframework.stereotype.Component;
import ru.osada.spring.models.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vladislav Osada
 * @date 29.04.2023 16:04
 */
@Component
public class PersonDAO {
    private final List<Person> people;
    private int PEOPLE_COUNT;
    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT,"Влад"));
        people.add(new Person(++PEOPLE_COUNT, "Ярик"));
        people.add(new Person(++PEOPLE_COUNT,"Макс"));
        people.add(new Person(++PEOPLE_COUNT, "Егор"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId()==id).findAny().orElse(null);
    }
}
