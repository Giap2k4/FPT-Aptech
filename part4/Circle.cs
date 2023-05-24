using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace daHinh2
{
    internal class Circle : GeometricCircle
    {
        protected double radius;
        protected double area;
        protected double perimeter;

        public Circle(double radius)
        {
            this.radius = radius;
        }

        public Circle()
        {
        }


        public override double getArea()
        {
            return radius * radius * Math.PI;
        }

        public override double getPerimeter()
        {
            return radius * 2 * Math.PI;
        }

        public override String ToString()
        {
            return "Radius is: " + radius;
        }
    }
}
