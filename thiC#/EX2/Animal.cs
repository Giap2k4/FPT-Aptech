using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace Animal
{
    internal class Animal
    {
        protected string name;
        protected double weight;

        public Animal(string name, double weight)
        {
            this.name = name;
            this.weight = weight;
        }

        public Animal()
        {
        }

        public void SetMe(string name1, double weight1)
        {
            name = name1;
            weight = weight1;
        }

        public void Show()
        {
            Console.WriteLine("Name: " + name+", Weight: "+weight);
        }
    }
}
