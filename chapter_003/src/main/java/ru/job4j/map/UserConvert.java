package ru.job4j.map;

import java.util.HashMap;
import java.util.List;

/**
 * Класс UserConvert - конвертация листа пользователей в карту с парами ключ-значение.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 08.12.2018
 */
public class UserConvert {
    public HashMap<Integer, User> convert(List<User> list) {
        HashMap<Integer, User> result = new HashMap<>();
        for (User obj : list) {
            result.put(obj.getId(), obj);
        }
        return result;
    }
}
