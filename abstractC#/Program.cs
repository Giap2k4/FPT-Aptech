class Program
{
    static void Main(string[] args)
    {
        Circle c = new Circle(5,"red",1);
        Console.WriteLine(c.ToString());
        c.PWeight = 2;
        c.PColor = "blue";
        Console.WriteLine(c.ToString());

        Console.Write("Area of circle is: ");
        c.findArea();
        Console.Write("Perimeter of circle is: ");
        c.findPerimeter();
    }
}