package Decorator_Pattern;

public class whiteCoffee implements component{


    @Override
    public void coffeePowder() {
        System.out.println("Use powder for white coffee");
    }

    @Override
    public void water() {
        System.out.println("Use water for white coffee");
    }
}
