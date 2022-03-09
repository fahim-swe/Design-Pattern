package FactoryMethodPattern.FactoryObjects;

public class main {

    public static void main(String arg[])
    {
        KnifeFactory factory = new KnifeFactory();

        KnifeStore knifeStore = new KnifeStore(factory);

        Knife knife = knifeStore.orderKnife("steak");
    }
}

