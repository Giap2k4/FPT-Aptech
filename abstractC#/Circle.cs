class Circle : GeometricObject
{
    private double radius;

    public Circle(double radius,string color, double weight) : base(color, weight)
    {
        this.radius = radius;
    }

    public override double findArea()
    {
        double Area = radius * radius * Math.PI;
        Console.WriteLine(Area);
        return Area;
    }

    public override double findPerimeter()
    {
        double Perimeter = 2 * radius * Math.PI;
        Console.WriteLine(Perimeter);
        return Perimeter;
    }

    public override string? ToString()
    {
        return "Circle has: radius is: "+radius+", color is: "+PColor+", weigth is: "+PWeight;
    }
}