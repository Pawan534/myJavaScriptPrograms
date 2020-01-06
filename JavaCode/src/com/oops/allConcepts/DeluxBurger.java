package com.oops.allConcepts;

public class DeluxBurger extends Hamburgers {

    public DeluxBurger() {
        super("Delux", "Sasuage & Bacon", 20, "White");
        super.addHamburgersAdditional1("Chips", 2);
        super.addHamburgersAdditional2("Coke", 1.5);
    }


}
