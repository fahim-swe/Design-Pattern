package Decorator_Pattern;

public abstract class additionalElement implements component{

    private component component;

    public additionalElement(Decorator_Pattern.component component) {
        this.component = component;
    }

    @Override
    public void coffeePowder() {
        this.component.coffeePowder();
    }

    @Override
    public void water() {
        this.component.water();
    }
}
