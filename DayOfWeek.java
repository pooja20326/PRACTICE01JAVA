import java.util.*;
public class DayOfWeek 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day");
        int day=sc.nextInt();
        System.out.println("Enter the month");
        int month=sc.nextInt();
        System.out.println("enter the year");
        int year=sc.nextInt();
        Calendar ca=Calendar.getInstance();
        String[] weekdays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        ca.set(year,month-1,day);
        int day_of_week=ca.get(Calendar.DAY_OF_WEEK);
        System.out.println("That day was :"+ weekdays[day_of_week-1]);
    }
}

NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);