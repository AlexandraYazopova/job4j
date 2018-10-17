package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс ConsoleInput - считывание введенных данных из консоли.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 23.09.2018
 */
public class ConsoleInput implements Input {

    /**
     * Получение данных от пользователя с консоли.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Метод ask(String question) реализует общение с пользователем и получение данных от пользователя в виде строки.
     */
    @Override
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Метод ask(String question) реализует общение с пользователем и получение данных от пользователя в виде числа.
     */
    @Override
    public int ask(String question, ArrayList<Integer> range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (Integer value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Введите номер пункта меню.");
        }
    }

    /**
     * Метод ask(String question) реализует общение с пользователем и получение данных от пользователя в виде числа.
     */
    @Override
    public int id(String question) {
        int key = Integer.valueOf(this.ask(question));
        return key;
    }
}
