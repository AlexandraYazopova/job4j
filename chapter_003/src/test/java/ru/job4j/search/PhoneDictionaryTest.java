package ru.job4j.search;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 09.11.2018
 */
public class PhoneDictionaryTest {
    /**
     * Тест на поиск человека по имени.
     */
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Lesha", "Ivanov", "534872", "Moscow")
        );
        phones.add(
                new Person("Serezha", "Petrov", "534872", "Moscow")
        );
        List<Person> persons = phones.find("Lesha");
        Assert.assertThat(persons.iterator().next().getSurname(), Is.is("Ivanov"));
    }

    /**
     * Тест на поиск человека по фрагменту фамилии.
     */
    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        List<Person> persons = phones.find("Ar");
        Assert.assertThat(persons.iterator().next().getSurname(), Is.is("Arsentev"));
    }

    /**
     * Тест на поиск человека по фрагменту номера телефона.
     */
    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        List<Person> persons = phones.find("487");
        Assert.assertThat(persons.iterator().next().getSurname(), Is.is("Arsentev"));
    }

    /**
     * Тест на поиск человека по адресу.
     */
    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        List<Person> persons = phones.find("Bryansk");
        Assert.assertThat(persons.iterator().next().getSurname(), Is.is("Arsentev"));
    }
}
