package com.gmail.zavsek_o2;

public class Burger {
   private String bun;
   private String meat;
   private String cheese;
   private String vegetables;
   private String mayo;


   public Burger(String bun, String meat, String cheese, String vegetables, String mayo) {
       this.bun = bun;
       this.meat = meat;
       this.cheese = cheese;
       this.vegetables = vegetables;
       this.mayo = mayo;

       System.out.println("Состав обычного бургера:");
       displayIngredients();
   }


   public Burger(String bun, String meat, String cheese, String vegetables) {
       this.bun = bun;
       this.meat = meat;
       this.cheese = cheese;
       this.vegetables = vegetables;
       this.mayo = "без майонеза";

       System.out.println("Состав диетического бургера:");
       displayIngredients();
   }


   public Burger(String bun, String meat1, String meat2, String cheese, String vegetables, String mayo) {
       this.bun = bun;
       this.meat = meat1 + " + " + meat2;
       this.cheese = cheese;
       this.vegetables = vegetables;
       this.mayo = mayo;

       System.out.println("Состав бургера с двойным мясом:");
       displayIngredients();
   }


   private void displayIngredients() {
       System.out.println("Булочка: " + bun);
       System.out.println("Мясо: " + meat);
       System.out.println("Сыр: " + cheese);
       System.out.println("Овощи: " + vegetables);
       System.out.println("Майонез: " + mayo);
       System.out.println();
   }
}

