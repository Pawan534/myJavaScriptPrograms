package com.designPatterns;

public class NutritionFactsBuilderPattern {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;


    public static class Builder{
        // Required parameters
        private final int servingSize;
        private final int servings;
        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            calories = val;
            return this;
        }

        public Builder fat(int val){
            fat = val;
            return this;
        }

        public Builder sodium(int val){
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val){
            carbohydrate = val;
             return this;
        }

        public NutritionFactsBuilderPattern build(){
            return new NutritionFactsBuilderPattern(this);
        }
    }
    private NutritionFactsBuilderPattern(Builder nutritionBuilder){
        servingSize = nutritionBuilder.servingSize;
        servings = nutritionBuilder.servings;
        calories = nutritionBuilder.calories;
        fat = nutritionBuilder.fat;
        sodium=nutritionBuilder.sodium;
        carbohydrate = nutritionBuilder.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFactsBuilderPattern{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
