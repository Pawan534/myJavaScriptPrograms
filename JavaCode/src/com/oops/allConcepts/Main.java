package com.oops.allConcepts;

public class Main {

    public static void main(String[] args) {
        Hamburgers hamburgers = new Hamburgers("Basic", "Sasuage", 3.19, "White");
        double price = hamburgers.itemizeHamburger();
        hamburgers.addHamburgersAdditional1("Tomato", 0.27);
        hamburgers.addHamburgersAdditional2("Lettuce", 0.75);
        hamburgers.addHamburgersAdditional3("Cheese", 1.75);
        hamburgers.addHamburgersAdditional2("Garlic", 1.1);
        System.out.println("Total Burger price $" + hamburgers.itemizeHamburger());

        System.out.println("********************");

        HealthyBurger healthyBurger=new HealthyBurger("Bacon", 5.99);
        healthyBurger.addHamburgersAdditional1("Egg", 5.43);
        healthyBurger.addHealthyAdditional1("Chicken", 8);
        System.out.println("Total Burger price $" + healthyBurger.itemizeHamburger());

        System.out.println("********************");

        DeluxBurger db = new DeluxBurger();
        System.out.println("Total Burger price $" + db.itemizeHamburger());
//        healthyBurger.itemizeHamburger();

    }
}
