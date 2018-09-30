package ru.job4j.tracker;

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
     * Метод реализует общение с пользователем и получение данных от пользователя.
     */
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
