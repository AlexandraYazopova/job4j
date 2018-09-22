package ru.job4j.profession;

/**
 * Класс Diagnose  - описывает диагноз пациента.
 *
 * @author Alexandra Yazopova (mailto:alexandra.yaz@gmail.com)
 * @version 1
 * @since 22.09.2018
 */
public class Diagnose {
   /**
    * Название диагноза.
    */
   private String name;

   /**
    * Конструктор Diagnose.
    */
   public Diagnose(String name) {
      this.name = name;
   }

   /**
    * Метод setName - установить название диагноза.
    */
   public void setName(String name) {
   }

   /**
    * Метод getName - узнать название закрепленного диагноза.
    */
   public String getName() {
      return name;
   }
}
