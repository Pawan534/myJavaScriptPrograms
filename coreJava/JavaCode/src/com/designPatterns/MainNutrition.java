package com.designPatterns;

public class MainNutrition {
    public static void main(String[] args) {
        NutritionFactsBuilderPattern cocaCola = new NutritionFactsBuilderPattern.Builder(240, 8).build();
        System.out.println(cocaCola);


        NutritionFactsJavaBeansPattern cola = new NutritionFactsJavaBeansPattern();
        cola.setServingSize(240);
        cola.setServings(8);
        System.out.println(cola);
    }
}
