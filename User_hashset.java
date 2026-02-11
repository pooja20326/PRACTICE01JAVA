import java.util.*;
public class User_hashset 
{
public static void main(String[] args)
{
    HashSet<String> set=new HashSet<>();
    Scanner sc=new Scanner(System.in);
    int choice;
    do
    {
        System.out.println("\n--------UNIQUE USERNAME MANAGEMENT");
        System.out.println("1. Add username");
        System.out.println("2. View All user name");
        System.out.println("3. Remove username");
        System.out.println("4. View username");
        System.out.println("5. EXIT");
        System.out.println(" enter your choice");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Username");
                sc.nextLine();
                String username= sc.nextLine();
               if(set.add(username))
               {
                System.out.println("User Added Successfully");
               }
               else
               {
                System.out.println(" User Already exist");
               }
                break;
            case 2:
                if(set.isEmpty())
                {
                    System.out.println(" Users not found");
                }
                else
                {
                    System.out.println("All Username");
                    for(String u:set)
                    {
                        System.out.println(u);
                    }
                }
                break;
            case 3:
                System.out.println("Enter uername to remove");
                sc.nextLine();
                String removed=sc.nextLine();
                if(set.contains(removed))
                {
                    set.remove(removed);
                    System.out.println("User Removed Successfully!!!!!!!");
                }
                else
                {
                    System.out.println("No User found");
                }
               break;
            case 4:
                System.out.println("Enter user name to check : ");
                sc.nextLine();
                String check =sc.nextLine();
                if(set.contains(check))
                {
                    System.out.println("User is present");
                }
                else
                {
                    System.out.println("User is not present!!!!!!");
                }
                break;
            case 5:
                System.out.println("Exiting System Bye!!!!!");
                break;
            default:
                System.out.println("Invalid option!!!!!!");
                break;
        }

    }while(choice!=5);
    sc.close();
}
}