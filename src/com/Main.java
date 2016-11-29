package com;

import DevCat.Cat;
import DevCat.Sportsmn;
import devPeople.People;
import impl.DriverBus;

public class Main {

    static Cat cat = new Cat(10, "Bezdomnaya", "Bomguk");
    static People people = new People("Ivan", "Pukin", 445, cat);
    public static void main(String[] args) {
      //  cat = new Cat(2, "Dvornyagjka", "Garfild");

      //people = new devPeople("Ivan", "Pukin", 445, cat);
        people.getCat().setName("asdasd");
        System.out.println(people);
people.getCat().say();
        people.sayHello();


        Sportsmn sportsmn = new Sportsmn("DENIS" , "vOVOCHKIN", 19, null);
        sportsmn.sayHello();
        sportsmn.setTypeSport("Tenis");
        System.out.println(sportsmn.getTypeSport());

       DriverBus t = new DriverBus();
        System.out.println(t.getSpead());
        t.setCategory("Z");
        t.go();
        t.hoursInSpace(200);
        t.maximumHeigh(99);
    }
}
