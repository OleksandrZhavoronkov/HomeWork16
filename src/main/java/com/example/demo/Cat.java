package com.example.demo;
//Создать класс Cat.
        //У кота должны быть такие свойства как имя, возраст, вес, порода.
        //Создать конструктор по умолчанию, конструктор с 4 параметрами, конструктор с 2 параметрами(имя и возраст)
        //Переопределить метод toString
        //Реализовать для класса Cat свою версию метода equals, который будет сравнивать котов только по весу и возрасту.
        //Создать 2 кота и вывести на экран результат их сравнения

import java.sql.SQLOutput;

public class Cat {
    String name;
    int age;
    int weight;
    String Breed;

    //default constructor
    public Cat() {
    }
    //constructor with 4 parameters
    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.Breed = breed;
    }
    //constructor with 2 parameters
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //overriding methods for future objects use to display parameters/text, etc. in a way that human can read
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", Breed='" + Breed + '\'' +
                '}';
    }

    public String toString(String name, int age) {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //Method to equalize objects
    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat1 = (Cat) obj;
            return this.age == cat1.age && this.weight == cat1.weight;
        }
        return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik",15,100,"Dvorovoi");
        Cat cat2 = new Cat("Marsik",20,100,"x");
        Cat cat3 = new Cat("Tarsik",20,100,"Dvorovoi");
        Cat cat4 = new Cat("Darsik",20,100,"y");
        System.out.println( cat1.name + " has the same as " + cat2.name + " Age and weight?"+ " - " +  cat1.equals(cat2));
        System.out.println( cat3.name + " has the same as " + cat4.name + " Age and weight?"+ " - " +  cat3.equals(cat4));
    }
}




