package FactoryMethodPattern.FactoryObjects;

public class KnifeFactory {
    public Knife createKnife(String knifeType)
    {
        Knife knife = null;


        // create Knife object
        if(knifeType == "steak"){
            knife = new SteakKnife();
        }
        else if(knifeType == "chefs"){
            knife = new ChefsKnife();
        }
        return knife;
    }
}
