package Singleton;

public class ExampleSinglenton {

    // the class varibale is null if no instance is instantiated
    private static ExampleSinglenton uniqueInstance = null;

    private ExampleSinglenton()
    {

    }


    // lazy construction of the instance
    public static ExampleSinglenton getInstance(){

        if(uniqueInstance == null){
            uniqueInstance = new ExampleSinglenton();
        }
        return uniqueInstance;
    }

    public void printInfo()
    {
        System.out.println("This is ExampleSingle ton class");
    }


}
