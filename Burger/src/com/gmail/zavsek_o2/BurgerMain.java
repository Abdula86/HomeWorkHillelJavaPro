package com.gmail.zavsek_o2;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burgerMain = new Burger("булочка", "котлета", "сыр",
                "овощи", "майонез");


        Burger dietBurger = new Burger(" булочка ржаная", "курица", "сыр",
                "салат");


        Burger doubleMeatBurger = new Burger("булочка", "говядина", "свинина",
                "сыр", "овощи", "соус барбекю");
    }
}
