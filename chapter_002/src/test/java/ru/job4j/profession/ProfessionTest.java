package ru.job4j.profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 22.09.2018
 */
public class ProfessionTest {

    /**
     * Test - Profession Doctor.
     */
    @Test
    public void professionDoctor() {
        Doctor doctor = new Doctor("Petr", "Psychotherapist");
        assertThat(doctor.getName() + doctor.getProfession(), is("Petr" + "Psychotherapist"));
    }

    /**
     * Test - Profession Teacher.
     */
    @Test
    public void professionTeacher() {
        Teacher teacher = new Teacher("Olga", "teacher", "Math");
        assertThat(teacher.getName() + teacher.getProfession() + teacher.getQualification(), is("Olga" + "teacher" + "Math"));

    }

    /**
     * Test - Profession Engineer.
     */
    @Test
    public void professionEngineer() {
        Profession engineer = new Profession("Slava", "Woodworker");
        assertThat(engineer.getName() + engineer.getProfession(), is("Slava" + "Woodworker"));
    }
}
