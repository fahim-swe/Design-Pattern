package Decorator_Pattern;

public class Sugar extends additionalElement{
    public Sugar(Decorator_Pattern.component component) {
        super(component);
    }


    public void adding()
    {
        System.out.println("Adding some sugar");
    }

    @Override
    public void coffeePowder() {
        this.adding();
    }

    @Override
    public void water() {

    }
}
