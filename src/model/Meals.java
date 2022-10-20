package model;

public class Meals {
    private String mealType;
    private String meal;
    private double mealPrice;

    public Meals() {
    }

    public Meals(String mealType, String meal, double mealPrice) {
        this.mealType = mealType;
        this.meal = meal;
        this.mealPrice = mealPrice;
    }

    public String getMealType() {
        return this.mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getMeal() {
        return this.meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public double getMealPrice() {
        return this.mealPrice;
    }

    public void setMealPrice(double mealPrice) {
        this.mealPrice = mealPrice;
    }
}