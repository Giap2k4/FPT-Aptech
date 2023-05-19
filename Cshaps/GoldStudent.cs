class GoldStudent : Student
{
    private double bonus;
    public void inputBonus()
    {
        Console.Write("Input bonus: ");
        bonus = Convert.ToDouble(Console.ReadLine());
    }

    public void display3()
    {
        Console.WriteLine("Bonus: " + bonus + " milion");
    }
}