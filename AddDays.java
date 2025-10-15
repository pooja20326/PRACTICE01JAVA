import java.util.*;

public class AddDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter days to add: ");
        int addDays = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);  // Set initial date

        // Add given days
        c.add(Calendar.DAY_OF_MONTH, addDays);

        int newDay = c.get(Calendar.DAY_OF_MONTH);
        int newMonth = c.get(Calendar.MONTH) + 1;
        int newYear = c.get(Calendar.YEAR);

        System.out.println("New Date: " + newDay + "/" + newMonth + "/" + newYear);
    }
}
