import java.util.*;
import java.util.LinkedList;
class BrowserHistory
{
    String url;
    BrowserHistory(String url)
    {
        this.url=url;
    }
}
public class Historymanager
{
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\n--------- Browser Manager-------------");
            System.out.println("1. Visit new page ");
            System.out.println("2. Go Back");
            System.out.println("3. Go forward");
            System.out.println("4. View History");
            System.out.println("5. Exit");
            System.out.println(" Enter your Choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println(" Enter website URL");
                    sc.nextLine();
                    String url=sc.nextLine();
                    list.add(url);
                    System.out.println("Visited  : "+url);
                    break;
                case 2:
                    if(list.size()>1)
                    {
                        String removed=list.removeLast();
                        System.out.println("Went back from  : "+removed);
                        System.out.println("Current Page : "+list.getLast());
                    }
                    else
                    {
                        System.out.println("No Previous pages");
                    }
                    break;
                case 3:
                    System.out.println(" Forward not implented simple version");
                    break;
                case 4:
                    System.out.println(" Browser History");
                    for(String s:list)
                    {
                        System.out.println(s);
                    }
                    break;
                case 5:
                    System.out.println(" Good Bye");
                    break;
                default:
                System.out.println(" Invalid choice");
            }
        }while(choice!=5);
    }
}