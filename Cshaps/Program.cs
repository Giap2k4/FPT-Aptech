class Program
{
    static void Main(string[] args)
    {
        
        Console.WriteLine("1. Staff\n2. Student\nInput: ");
        int a = Convert.ToInt32(Console.ReadLine());
        switch (a)
        {
            case 1:
                Manager m = new Manager();
                m.showInput();
                m.inputSalary1();
                m.inputLever();
                Console.WriteLine("---------------------");
                m.display1();
                m.display2();
                m.display3();


                break;
            case 2:
                GoldStudent g = new GoldStudent();
                g.showInput();
                g.inputGPA();
                g.inputBonus();
                Console.WriteLine("---------------------");
                g.display1();
                g.display2();
                g.display3();
                break;
        }
    }
}