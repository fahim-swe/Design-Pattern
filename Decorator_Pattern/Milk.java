package Decorator_Pattern;

public class Milk extends additionalElement{


    public Milk(Decorator_Pattern.component component) {
        super(component);
    }

    @Override
    public void coffeePowder() {
        this.print();
    }

    @Override
    public void water() {

    }

    public void print()
    {
        System.out.println("Adding some milk");
    }
}
