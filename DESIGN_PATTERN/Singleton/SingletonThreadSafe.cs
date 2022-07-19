using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DESIGN_PATTERN.Singleton
{
    public sealed class SingletonThreadSafe
    {
        private SingletonThreadSafe(){}

        private static SingletonThreadSafe instance;

        private static readonly object _lock = new object();

    
        public static SingletonThreadSafe getInstance()
        {
            lock (_lock)
            {
               if(instance == null){
                instance = new SingletonThreadSafe();
               }
               return instance;
            }
        }

        public void printInfo()
        {
            Console.WriteLine("Thread Safe Single Ton pattern");
        }
    }
}