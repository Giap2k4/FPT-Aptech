class Student : People
{
    private double GPA;
    public void inputGPA()
    {
        Console.Write("Input GPA: ");
        GPA = Convert.ToDouble(Console.ReadLine());
    }

    public void display2()
    {
        Console.WriteLine("GPA: " + GPA);
    }
}