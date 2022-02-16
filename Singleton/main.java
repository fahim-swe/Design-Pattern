package Singleton;

public class main {
    public static void main(String args[])
    {
        ExampleSinglenton ex1;

        ex1 = ExampleSinglenton.getInstance();

        ex1.printInfo();

        ExampleSinglenton ex2;

        ex2 = ExampleSinglenton.getInstance();

        ex2.printInfo();

        if(ex1 == ex2){
            System.out.println("Same Object");
        }
    }
}
