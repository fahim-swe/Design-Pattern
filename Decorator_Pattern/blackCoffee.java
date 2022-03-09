package Decorator_Pattern;

public class blackCoffee implements component {


    @Override
    public void coffeePowder() {
        System.out.println("Powder for black coffee");
    }

    @Override
    public void water() {
        System.out.println("Water for black coffee");
    }



}
