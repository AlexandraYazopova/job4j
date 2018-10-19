package ru.job4j.tracker;

import java.util.List;

public class ValidateInput extends ConsoleInput {
    public int ask(String question, List<Integer> range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Пожалуйста введите значение из списка");
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста введите корректное значение");
            }
        } while (invalid);
        return value;
    }

    public int id(String question) {
        boolean invalid = true;
        int id = -1;
        do {
            try {
                id = Integer.valueOf(super.ask(question));
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста введите корректное значение");
            }
        } while (invalid);
        return id;
    }
}
