package FactoryMethodPattern.FactoryObjects;

public class KnifeStore {

    private KnifeFactory factory;


    // constructor
    public KnifeStore(KnifeFactory factory){
        this.factory = factory;
    }

    public Knife orderKnife(String knifeType)
    {
        Knife knife;

        knife = factory.createKnife(knifeType);


        // prepare the knife

        return knife;
    }
}
