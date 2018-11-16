package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс PhoneDictionary - телефонный справочник.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 09.11.2018
 */
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
            if (i.getName().contains(key)
                    || i.getSurname().contains(key)
                    || i.getPhone().contains(key)
                    || i.getAddress().contains(key)
                ) {
                result.add(i);
            }
        }
        return result;
    }
}
