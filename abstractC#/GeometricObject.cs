abstract class GeometricObject
{
    private string color;
    private double weight;

    protected GeometricObject(string color, double weight)
    {
        this.color = color;
        this.weight = weight;
    }
    public string PColor
    {
        get { return color; }
        set { color = value; }
    }

    public double PWeight
    {
        get { return weight; }
        set { weight = value; }
    }

    public abstract double findArea();
    public abstract double findPerimeter();
}