package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
   private Food[] foodItems;

    public ShoppingCart(Food[] foodItems) {
        this.foodItems = foodItems;
    }

    public double totalPrice() {
        double sum = 0;
        for (Food foodItem : foodItems) {
            sum = sum + foodItem.getAmount() * foodItem.getPrice();
        }
        return sum;
    }

    public double discountPrice() {
        double sum =0;
        for (Food foodItem : foodItems) {
            double  discount = ((100 - foodItem.getDiscount())/100);
            sum = sum + (foodItem.getAmount() * foodItem.getPrice() *discount);
        }
        return sum;
    }

    public double totalVegetarianPrice() {
        double sum = 0;
        for (Food foodItem : foodItems) {
            if (foodItem.isVegetarian()){
                sum = sum + foodItem.getAmount() * foodItem.getPrice();
            }
        }
        return sum;
    }
}
