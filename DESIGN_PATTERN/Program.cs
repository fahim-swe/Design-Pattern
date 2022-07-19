// See https://aka.ms/new-console-template for more information
using DESIGN_PATTERN.Singleton;

internal class Program
{
    private static void Main(string[] args)
    {
        Console.WriteLine("Hello, World!");


        // 1) SingleTon pattern 
        Singleton singleton1 = Singleton.getInstance();
        singleton1.printInfo();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.printInfo();
        if(singleton1.Equals(singleton2)){
            Console.WriteLine("Working Fine.. ");
        }

        // SingleTon pattern Thread Safe
        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();
        singletonThreadSafe1.printInfo();
    }
}

