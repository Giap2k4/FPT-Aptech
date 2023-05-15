class Program
{
    public static void Main(string[] args)
    {
        Atomic atm = new Atomic();
        int i = 0;
        System.Console.WriteLine("1. Enter atom: \n2. Atomic display: ");
        do
        {
            i++;
            System.Console.WriteLine("Input change: ");
            int x = Convert.ToInt32(Console.ReadLine());
            switch(x)
            {
                case 1:
                    atm.accept();
                    break;
                case 2:
                    atm.display();
                    return;
                default:
                    System.Console.WriteLine("Enter the wrong selection");
                    break;

            }
        } while (i != 10);
        if(i == 10)
        {
            atm.display();
        }
        
        
        
    }
}