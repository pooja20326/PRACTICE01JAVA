class Car
{
    String brand;
    int speed;
 void drive()
    {
        System.out.println("Car is Driving ");
    }
    public static void main(String[] args)
    {
        Car C= new Car();
        Car C1=new Car();
        C.brand="BMW";
        C.speed=300;
        C.drive();
        C1.brand="Audi";
        C1.speed=200;
        C1.drive();
    }
}
