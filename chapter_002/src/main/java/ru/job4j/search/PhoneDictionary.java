package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    /**
     * @param хранит ссылку на массив типа Person.
     */
    private List<Person> persons = new ArrayList<Person>();

    /**
     * Метод добавляет человека в справочник.
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Метод ищет совпадения между введенной комбинацией символов и
     * фамилией, именем, номером телефона и адреса каждого человека из справочника.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (Person i : persons) {
            if (persons.iterator().next().getName().contains(key)
                    | persons.iterator().next().getSurname().contains(key)
                    | persons.iterator().next().getPhone().contains(key)
                    | persons.iterator().next().getAddress().contains(key)
                ) {
                result.add(i);
            }
        }
        return result;
    }
}
