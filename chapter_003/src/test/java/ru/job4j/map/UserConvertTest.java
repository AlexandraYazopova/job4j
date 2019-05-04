package ru.job4j.map;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 08.12.2018
 */
public class UserConvertTest {
    /**
     * Тест на конвертацию листа из 3 значений в мап.
     */
    @Test
    public void when3ElementsListToMap() {
        UserConvert map = new UserConvert();
        List<User> list = new ArrayList<>();
        list.add(
                new User(1, "Ivan", "Moscow")
        );
        list.add(
                new User(2, "Petr", "Tver'")
        );
        list.add(
                new User(3, "Olga", "Kolomna")
        );
        HashMap<Integer, User> result = map.convert(list);
        HashMap<Integer, User> expect = new HashMap<>();
        expect.put(1, new User(1, "Ivan", "Moscow"));
        expect.put(2, new User(2, "Petr", "Tver'"));
        expect.put(3, new User(3, "Olga", "Kolomna"));
        Assert.assertThat(result, Is.is(expect));
    }
}
