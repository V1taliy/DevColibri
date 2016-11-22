package com;

import DevCat.Cat;
import People.People;

public class Main {
    static Cat cat = new Cat(10, "Bezdomnaya", "Bomguk");
    static People people = new People("Ivan", "Pukin", 445, cat);
    public static void main(String[] args) {
      //  cat = new Cat(2, "Dvornyagjka", "Garfild");

      //people = new People("Ivan", "Pukin", 445, cat);
        people.getCat().setName("asdasd");
        System.out.println(people);
people.getCat().say();



    }
}
