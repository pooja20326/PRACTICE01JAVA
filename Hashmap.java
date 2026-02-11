import java.util.*;
public class Hashmap 
{
public static void main(String[] args)
{
    HashMap<Long,String> e=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    int choice;
    do
    {
        System.out.println("/n--------CONTACT BOOK---------");
        System.out.println("1. Add Contact");
        System.out.println("2. View Contact");
        System.out.println("3. Delete Contact");
        System.out.println("4. Search Contact");
        System.out.println("5. Exit System");
        System.out.println("Enter Your Choice");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter phone no :");
                Long phoneno=sc.nextLong();
                System.out.println("Enter name:");
                sc.nextLine();
                String name=sc.nextLine();
                e.put(phoneno, name);
                System.out.println("Contact saved Successfully"); 
                break;
            case 2:
                if(e.isEmpty())
                {
                    System.out.println("The contact List is Empty!!!!!!");
                }
                else
                {
                    System.out.println("All Contact");
                    for(Map.Entry<Long,String> y:e.entrySet())
                    {
                       System.out.println(y.getKey() + "-->" + y.getValue());
                    }
                }
                break;
            case 3:
                System.out.println("Enter Phone no to delete");
                Long phone=sc.nextLong();
                if(e.remove(phone)!=null)
                {
                    System.out.println("Contact removed Successfully");
                }
                else
                {
                    System.out.println("Contact Not found");
                }
                
                break;
            case 4:
                System.out.println("Enter no to search");
                int Search=sc.nextInt();
                if(e.containsKey(Search))
                {
                    System.out.println("Name:" + e.get(Search));
                }
                else
                {
                    System.out.println("Contact Not found");
                }
                break;
            case 5:
                System.out.println("Thank you for Using Contact System");
                break;
            default:
                System.out.println("Invalid Option!!!!!!!");
                break;
        }

    }while(choice!=5);
    sc.close();
}
}