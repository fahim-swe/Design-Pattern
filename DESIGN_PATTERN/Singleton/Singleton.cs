using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DESIGN_PATTERN.Singleton
{
    public sealed class Singleton
    {
        private Singleton(){}

        private static Singleton instance;

        public static Singleton getInstance()
        {
            if(instance == null){
                instance = new Singleton();
            }

            return instance;
        }

        public void printInfo()
        {
            Console.WriteLine("SingleTon Pattern");
        }
    }
}