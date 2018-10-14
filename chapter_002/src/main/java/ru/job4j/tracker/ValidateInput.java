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

    public String askDate(String question) {
        boolean invalid = true;
        long date = 0L;
        do {
            try {
                date = Long.parseLong(super.ask(question));
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста введите корректное значение");
            }
        } while (invalid);
        return String.valueOf(date);
    }
}
