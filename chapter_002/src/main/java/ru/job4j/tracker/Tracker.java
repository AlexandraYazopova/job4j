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
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

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
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private int generateId() {
     return Math.abs(RN.nextInt());
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
    public boolean replace(int id, Item item) {
        boolean result = false;
        for (int i = 0; i != position; i++) {
            if (items[i] != null && items[i].getId() == id) {
                items[i] = item;
                item.setId(id);
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
    public boolean delete(int id) {
        boolean result = false;
        for (int i = 0; i != position; i++) {
            if (items[i] != null && items[i].getId() == id) {
                System.arraycopy(items, i + 1, items, i, items.length - i - 1);
                position--;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод, реализующий получение списка всех заявок в хранилище.
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод, реализующий поиск заявки по ее уникальному ключу.
     * @param id уникальный ключ заявки.
     */
    public Item findById(int id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Метод, реализующий поиск заявки по ее имени.
     * @param key уникальный ключ заявки.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int in = 0;
        for (int index = 0; index != position; index++) {
            if (items[index].getName().equals(key)) {
                result[in] = this.items[index];
                in++;
            }
        }
        return Arrays.copyOf(result, in);
    }
}
