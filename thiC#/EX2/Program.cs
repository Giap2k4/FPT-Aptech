namespace Animal
{
    class View
    {
        static void Main(string[] args)
        {
            Tiger t = new Tiger();
            Lion l = new Lion();
            t.SetMe("tiger", 100);
            t.Show();

            l.SetMe("lion", 200);
            l.Show();
        }
    }
}