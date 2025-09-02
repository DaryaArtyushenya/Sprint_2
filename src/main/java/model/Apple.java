package model;


import static model.constants.Colour.RED_APPLE;
import static model.constants.Discount.*;

public class Apple extends Food{
    private String colour;

   public Apple(int amount, double price, String colour){
       this.amount = amount;
       this.price = price;
       this.colour = colour;
       this.isVegetarian = true;
   }

    @Override
    public double getDiscount() {
        if (colour.equals(RED_APPLE)){
            return RED_APPLE_DISCOUNT;
        }else{
            return DEFAULT_DISCOUNT;
        }
    }
}
