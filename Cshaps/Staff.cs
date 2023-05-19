class Staff : People
{
    private double salary;


    public void inputSalary1()
    {
        Console.Write("Input salary: ");
        salary = Convert.ToDouble(Console.ReadLine());

    }

    public void display2()
    {
        Console.WriteLine("Salary is: " + salary);
    }

}