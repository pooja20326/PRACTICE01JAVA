
class vehicle
{
    void start()
    {
        System.out.println("Vehicle started");
    }
}
class car extends vehicle
{
void drive()
{
    System.out.println("Car is driving");
}
}
public class Inheritence {

    public static void main(String[] args)
    {
car c=new car();
c.start();
c.drive();
    }
}