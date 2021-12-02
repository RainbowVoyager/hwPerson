package com.cherevataya;
/*
1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
Создать один или несколько конструкторов которые гарантирует что у каждого есть имя и фамилия.
Создать список из 100 обьектов типа Person заполненных случайными данными
(Например создать массив на несколько имен и выбирать из него случайным образом).
Код который создает список Person и заполняет его данными разместить в другом классе, не в Person.
Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
не было человека весом 3 кг и ростом 180 итд
 */

import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Person> people = NewPerson.generatePersons();
        for (Person person : people) {
            System.out.println(person);

        }
        System.out.println("I'm just saying that, you know, Andrey, your such an awesome guy.");
        System.out.println("Thank you so much for being so kind to me. Kudos to you ^^ ");
        System.out.println("All credit goes to AKadatsky");
    }

}