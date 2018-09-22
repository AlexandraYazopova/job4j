package ru.job4j.profession;

/**
 * Класс Teacher - описывает имя и специальность учителя, показывает его студентов.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 22.09.2018
 */
public class Teacher extends Profession {
    /**
     * Специальность учителя.
     */
    private String qualification;

    /**
     * Учитель учит конкретного студента.
     */
    private Student student;

    /**
     * Конструктор Teacher - переопределение полей.
     */
    public Teacher(String name, String profession, String qualification) {
        this.name = name;
        this.profession = profession;
        this.qualification = qualification;
    }

    /**
     * Метод setQualification - установить специальность учителя.
     */
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    /**
     * Метод getQualification - узнать специальность учителя.
     * @return специальность учителя.
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * Метод setStudent - закрепить студента за учителем.
     */
    public void setStudent(Student student) {
    }

    /**
     * Метод getStudent - узнать имя закрепленного студента.
     * @return студента.
     */
    public Student getStudent() {
        return student;
    }

}
