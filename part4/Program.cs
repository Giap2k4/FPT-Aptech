namespace daHinh2
{
    class Program
    {
        static void Main(string[] args)
        {
            ResizableCircle r = new ResizableCircle(3);
            Console.WriteLine("Area is: "+r.getArea());
            Console.WriteLine("Perimeter is: "+r.getPerimeter());
            Console.WriteLine("----------------");
            r.resize(50);

        }
    }
}