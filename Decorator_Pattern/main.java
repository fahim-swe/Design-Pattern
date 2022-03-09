package Decorator_Pattern;

public class main {

    public static void main(String arg[])
    {
        component component = new blackCoffee();
        // concrete component
        component.coffeePowder();
        component.water();


        // concrete decorator 1
        component = new Milk(component);
        component.coffeePowder();
        component.water();


        // concrete decorator 2
        component = new Sugar(component);
        component.coffeePowder();


    }
}

