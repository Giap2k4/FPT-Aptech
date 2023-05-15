using System.Collections;

class Atomic
{
    private int soNguyenTu;
    private string kyHieu;
    private string dayDu;
    private double trongLuong;

    public Atomic(int soNguyenTu, string kyHieu, string dayDu, double trongLuong)
    {
        this.soNguyenTu = soNguyenTu;
        this.kyHieu = kyHieu;
        this.dayDu = dayDu;
        this.trongLuong = trongLuong;
    }

    public Atomic()
    {
    }

   

    ArrayList arr = new ArrayList();
    public bool accept()
    {
        System.Console.WriteLine("Atomic Information \n ==================");
        System.Console.WriteLine("Enter atomic number : ");
        soNguyenTu = Convert.ToInt32(System.Console.ReadLine());
        System.Console.WriteLine("Enter symbol : ");
        kyHieu = Console.ReadLine();
        System.Console.WriteLine("Enter full name : ");
        dayDu = Console.ReadLine();
        System.Console.WriteLine("Enter atomic weight :  ");
        trongLuong = Convert.ToDouble(System.Console.ReadLine());


        Atomic atm = new Atomic(soNguyenTu,kyHieu,dayDu,trongLuong);
        arr.Add(atm);
        return true;

    }

    public void display()
    {
        foreach (Atomic at in arr)
        {
            System.Console.WriteLine(at.soNguyenTu + " " + at.kyHieu + " " + at.dayDu + " " + at.trongLuong);
        }
    }
}