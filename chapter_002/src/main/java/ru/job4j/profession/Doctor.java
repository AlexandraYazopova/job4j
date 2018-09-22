package ru.job4j.profession;

/**
 * Класс Doctor - описывает имя и специальность врача, показывает установленные врачом диагнозы для разных пациентов.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 21.09.2018
 */
public class Doctor extends Profession {
    /**
     * Доктор лечит конкретного пациента.
     */
    private Patient patient;
    /**
     * Доктор устанавливает диагноз.
     */
    private Diagnose diagnose;


    /**
     * Конструктор Doctor - переопределение полей.
     */
    public Doctor(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    /**
     * Метод setPatient - закрепить пациента за врачом.
     */
    public void setPatient(Patient patient) {
    }

    /**
     * Метод getPatient - узнать имя закрепленного пациента.
     * @return пациент.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Метод heal возвращает диагноз для конкретного пациента.
     * @param patient -  имя пациента.
     * @return диагноз.
     */
    public Diagnose heal(Patient patient) {
        return diagnose;
    }
}
