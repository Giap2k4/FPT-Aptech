class People
{
    private int id;
    private string name;
    private string email;

    

    public void showInput()
    {
        Console.Write("Input id: ");
        id = Convert.ToInt32(Console.ReadLine());
        Console.Write("Input name: ");
        name = Console.ReadLine();
        Console.Write("Input email: ");
        email = Console.ReadLine();
    }

    public void display1()
    {
        Console.WriteLine("Id: "+id);
        Console.WriteLine("Name: " + name);
        Console.WriteLine("Email: " + email);
    }

}



