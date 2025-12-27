class Printer
{
    void printer(String s)
    {
        System.out.println(s);
    }
    void printer(int a)
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Printer p=new Printer();
        p.printer("Pooja");
        p.printer(22);
    }
}