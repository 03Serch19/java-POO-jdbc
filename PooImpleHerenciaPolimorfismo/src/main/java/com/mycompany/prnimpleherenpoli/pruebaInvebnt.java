package com.mycompany.prnimpleherenpoli;


class Animal {}
class Perro extends Animal {}


public class pruebaInvebnt {
    public static void main(String[] args) {
     Animal a/*=null;*/ = new Animal();
     Perro p/*=null;*/= new Perro();
    // a=p;

    System.out.println(a instanceof Animal); // true
    System.out.println(p instanceof Perro);  // true
    System.out.println(p instanceof Animal); // true (porque Perro es un Animal)
    System.out.println(a instanceof Perro);  // false (un Animal no es necesariamente un Perro) 
    }
}
