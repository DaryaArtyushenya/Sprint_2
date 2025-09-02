import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_APPLE;
import static model.constants.Colour.RED_APPLE;


public class Main {
    public static void main(String[] args){

        var meat = new Meat(5, 100);
        var redApple  = new Apple(10,50, RED_APPLE);
        var greenApple = new Apple(8,60,GREEN_APPLE);

        Food[] foodItems = {meat, redApple, greenApple};
        var shoppingCart = new ShoppingCart(foodItems);

        String totalPrice = String.format("Общая сумма товаров без скидки: %s" , shoppingCart.totalPrice());
        System.out.println(totalPrice);

        String discountPrice = String.format("Общая сумма товаров со скидкой: %s" , shoppingCart.discountPrice());
        System.out.println(discountPrice);

        String totalVegetarianPrice = String.format("Сумма всех вегетарианских продуктов без скидки: %s" , shoppingCart.totalVegetarianPrice());
        System.out.println(totalVegetarianPrice);
    }


}
