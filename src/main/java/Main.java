import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;



public class Main {
    public static void main(String[] args){

        var meat = new Meat(5, 100);
        var redApple  = new Apple(10,50, "red");
        var greenApple = new Apple(8,60,"green");

        Food[] foodItems = {meat, redApple, greenApple};
        var shoppingCart = new ShoppingCart(foodItems);

        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.totalPrice());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.discountPrice());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " +shoppingCart.totalVegetarianPrice());
    }


}
