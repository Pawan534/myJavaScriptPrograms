package com.oops.allConcepts;

public class Hamburgers {

    private String breadRollType;
    private String meat;
    private String name;
    private double price;

    private String additional1Name;
    private double additional1Price;

    private String additional2Name;
    private double additional2Price;

    private String additional3Name;
    private double additional3Price;

    private String additional4Name;
    private double additional4Price;

    public Hamburgers(String name, String meat,double price, String breadRollType) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.name = name;
        this.price = price;
    }

    public void addHamburgersAdditional1(String name, double price){
        this.additional1Name = name;
        this.additional1Price = price;
    }

    public void addHamburgersAdditional2(String name, double price){
        this.additional2Name = name;
        this.additional2Price = price;
    }

    public void addHamburgersAdditional3(String name, double price){
        this.additional3Name = name;
        this.additional3Price = price;
    }

    public void addHamburgersAdditional4(String name, double price){
        this.additional4Name = name;
        this.additional4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll price is $" + this.price );

        if(this.additional1Name !=null){
                hamburgerPrice += this.additional1Price;
            System.out.println("Added "+ this.additional1Name + " for an extra $" + this.additional1Price);
        }
        if(this.additional2Name!=null){
            hamburgerPrice += this.additional2Price;
            System.out.println("Added "+ this.additional2Name + " for an extra $" + this.additional2Price);
        }
        if(this.additional3Name!=null){
            hamburgerPrice += this.additional3Price;
            System.out.println("Added "+ this.additional3Name + " for an extra $" + this.additional3Price);
        }
        if(this.additional4Name!=null){
            hamburgerPrice += this.additional4Price;
            System.out.println("Added "+ this.additional4Name + " for an extra $" + this.additional4Price);
        }
        return hamburgerPrice;
    }
}
