package model;

import static model.constants.Colour.redApple;
import static model.constants.Discount.defaultDiscount;
import static model.constants.Discount.redAppleDiscount;

public class Apple extends Food implements Discountable{
    private String colour;

   public Apple(int amount, double price, String colour){
       this.amount = amount;
       this.price = price;
       this.colour = colour;
       this.isVegetarian = true;
   }

    @Override
    public double getDiscount() {
        if (colour.equals(redApple)){
            return redAppleDiscount;
        }else{
            return defaultDiscount;
        }
    }
}
