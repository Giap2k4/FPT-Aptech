class Program
{
    public static void Main(string[] args)
    {
        Atomic atm = new Atomic();
        int i = 0;

        do
        {
            i++;
            atm.accept();
            
        } while (i != 3);
        System.Console.WriteLine("------------------------------------ ");
        atm.display();

    }
}