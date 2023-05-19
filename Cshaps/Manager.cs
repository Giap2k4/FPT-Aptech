class Manager : Staff
{
    private string level;
    public void inputLever()
    {
        Console.Write("Input level: ");
        level = Console.ReadLine();

    }

    public void display3()
    {
        Console.WriteLine("Level: " + level);
    }
}