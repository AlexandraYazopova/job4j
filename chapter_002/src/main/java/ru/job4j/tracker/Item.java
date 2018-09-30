package ru.job4j.tracker;

/**
 * Класс Item - описание заявки.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 23.09.2018
 */
public class Item {
    /**
     * Уникальный ключ заявки.
     */
    private String id;
    /**
     * Название заявки.
     */
    public String name;

    /**
     * Описание заявки.
     */
    public String description;

    /**
     * Дата создания заявки.
     */
    public long create;

    /**
     * Конструктор Item - переопределение полей.
     */
    public Item(String  name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    /**
     * Метод getName - узнать название заявки.
     * @return название заявки.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Метод getDescription - узнать описание заявки.
     * @return описание заявки.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Метод getCreate - узнать дату создания заявки.
     * @return дата создания заявки.
     */
    public long getCreate() {
        return this.create;
    }

    /**
     * Метод getId - узнать уникальный ключ заявки.
     * @return уникальный ключ заявки.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Метод setId - задать уникальный ключ заявки.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Переопределение метода toString,  чтобы выводить всю информацию о заявке.
     */
    @Override
    public String toString() {
        return "Item{"
                +
                "id = "
                + id
                //+ '\''
                +
                ", name = "
                + name
                //+ '\''
                +
                ", description = "
                + description
                //+ '\''
                +
                ", create = "
                + create
                +
                '}';
    }

}
