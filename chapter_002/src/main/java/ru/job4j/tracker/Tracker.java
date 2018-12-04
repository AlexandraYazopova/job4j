package ru.job4j.tracker;

import java.util.*;
/**
 * Класс Tracker - хранилище для заявок, с возможностью добавлять, удалять заявки.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 23.09.2018
 */
public class Tracker {
    /**
     * Лист для хранение заявок.
     */
    private List<Item> items = new ArrayList<>();

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Константа рандом.
     */
    private static final Random RN = new Random();

    /**
     * Метод, реализующий добавление заявки в хранилище.
     * @param item новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
     return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Метод generateDate - устанавливает дату заявки автоматически.
     */
    public String generateDate() {
        Date date = new Date();
        String dateCurrent = date.toString();
        return dateCurrent;
    }

    /**
     * Метод, реализующий изменение заявки в хранилище.
     * @param id уникальный ключ заявки.
     * @param item новая заявка.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (Item i: items) {
            if (i.getId().equals(id)) {
                items.set(items.indexOf(i), item);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод, реализующий удаление заявки по ее уникальному ключу в хранилище.
     * @param id уникальный ключ заявки.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (Item i: items) {
            if (i.getId().equals(id)) {
                items.remove(i);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод, реализующий получение списка всех заявок в хранилище.
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Метод, реализующий поиск заявки по ее уникальному ключу.
     * @param id уникальный ключ заявки.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item i : items) {
            if (i.getId().equals(id)) {
                result = i;
                break;
            }
        }
        return result;
    }

    /**
     * Метод, реализующий поиск заявки по ее имени.
     * @param key уникальный ключ заявки.
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item i : items) {
            if (i.getName().equals(key)) {
              result.add(i);
            }
        }
        return result;
    }
}
