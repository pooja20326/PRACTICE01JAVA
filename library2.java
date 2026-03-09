import java.util.*;
class book
{
    private int bookid;
    private String bookname;
    private User issuedto;
    public book(int bookid,String bookname)
    {
         this.bookid=bookid;
         this.bookname=bookname;
    }
    public int getbookid()
     {
        return bookid;
     }
     public User getissuedto()
     {
        return issuedto;
     }
     public void setissuedto(User user)
     {
        this.issuedto=user;
     }
     @Override
     public String toString()
     {
        if(issuedto==null)
        {
            return "BOOK ID : " + bookid + ", Name : "+ bookname+ ", STATUS AVAILABLE!";
        }
        else
        {
         return "BOOK ID : " + bookid + ",NAME : " + bookname + ", ISSUED TO : "  + issuedto.getusername();
        }
     }
}
//---------------------USER CLASS-----------------------------
class User
{
    private int userid;
    private String username;
    public User(int userid,String username)
    {
        this.username=username;
        this.userid=userid;
    }
    public int getuserid()
    {
        return userid;
    }
    public String getusername()
    {
        return username;
    }
    @Override
    public String toString()
    {
         return "USER ID :  " + userid + "USER NAME : " + username;
    }
}
//----------------------LIBRARY CLASS--------------------
class library
{
   private Map<Integer, book> books=new HashMap<>();
   private Map<Integer, User> user=new HashMap<>();
   public void addbook(int id, String name)
   {
    if(books.containsKey(id))
    {
        System.out.println("Book ID already existed !!");
    }
    else
    {
        books.put(id,new book(id,name));
        System.out.println("Book Added Successfully");
    }
    
   }
   public void adduser(int id, String name)
   {
    if(user.containsKey(id))
    {
        System.out.println("User already exists!!");
    }
    else
    {
        user.put(id,new User(id,name));
        System.out.println("User added successfully");
    }

   }
   public void viewuser()
   {
    if(user.isEmpty())
    {
        System.out.println("There is no user available!!!");
    }
    else
    {
        for(User u:user.values())
        {
            System.out.println(u);
        }
    }
   }
   public void viewbook()
   {
    if(books.isEmpty())
    {
        System.out.println(" Book is not Available!!!");
    }
    else
    {
        for(book b:books.values())
        {
            System.out.println(b);
        }
    }
   }
   public void issuebook(int bookid, int userid)
   {
    book b=books.get(bookid);
    User u=user.get(userid);
   if(b==null)
   {
    System.out.println("BOOK NOT FOUND");
   }
   else if(u==null)
   {
    System.out.println("User not found");
   }
   else if(b.getissuedto()!=null)
   {
    System.out.println("Book Already issued");
   }
   else
   {
      b.setissuedto(u);
      System.out.println(" Book Issued Successfully");
   }
}
public void returnbook(int bookid)
{
    book b=books.get(bookid);
if(b==null)
{
    System.out.println("Book Not found");
}
else if(b.getissuedto()==null)
{
    System.out.println(" Book not issued");
}
else
{
    b.setissuedto(null);
    System.out.println("Book returned Successfully");
}
}
}
//--------Main class-----------
public class library2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        library lib=new library();
        int choice;
        do
        {
            System.out.println("-----Library Management System----");
            System.out.println("1. Add bokk");
            System.out.println("2. Add User");
            System.out.println("3. View Book");
            System.out.println("4. View Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter Book Id: ");
                int bookid=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Book Name :");
                String Bookname=sc.nextLine();
                lib.addbook(bookid,Bookname);
                break;
            case 2:
                System.out.println("Enter User id :");
                int userid=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter user Name :");
                String Username=sc.nextLine();
                lib.adduser(userid,Username);
                break;
            case 3:
                lib.viewbook();
                break;
            case 4:
                lib.viewuser();
                break;
            case 5:
                System.out.println("Enter Book Id");
                int issuedbook=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter user id :");
                int issueuserid=sc.nextInt();
                lib.issuebook(issuedbook,issueuserid);
                break;
            case 6:
                System.out.println(" Enter book id:");
                int returnbook=sc.nextInt();
                lib.returnbook(returnbook);
                break;
            case 7:
                System.out.println("Thank you for using library Management");
                break;
            default:
                System.out.println("Invalid Option!!!");
                break;
            
        }
        }while(choice!=7);
        
    }
}