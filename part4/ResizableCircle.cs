using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace daHinh2
{
    internal class ResizableCircle : Circle, Resizable
    {
        

        public ResizableCircle(double radius) : base(radius)
        {
        }


        public void resize(int percent)
        {

            ResizableCircle r = new ResizableCircle(radius);
            
            double a = (100 - percent) * r.getArea() / 100;
            double b = (100 - percent) * r.getPerimeter() / 100;
            Console.WriteLine("The area of the circle after resizing is: " + a + "\nThe perimeter of the circle after resizing is: " + b);
        }
    }
}
