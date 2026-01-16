import java.util.*;

import javax.sql.rowset.spi.SyncFactory;
//-----------ABSTRACT------------
abstract class Account1
{
    protected String holdername;
    protected double balance;
    private int pin; //-------ENCAPSULATE---------
    Account1(String holdername , double balance, int pin)
    {
        this.holdername=holdername;
        this.balance=balance;
        this.pin=pin;
    }
    //-------ENCAPSULATION CONTROLLLED AACCESS---------
    public boolean validatePin(int enteredpin)
    {
       return this.pin==enteredpin;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
         balance+=amount;
         System.out.println(" Rs "+ amount + " deposited!!!!!!");
        }
        else
        {
            System.out.println(" Invalid amount");
        }
    }
    public void withdraw(double amount)
    {
        if(amount>0 && balance>=amount)
        {
            balance-=amount;
            System.out.println(" RS "+amount+" Withdrawn");
        }
        else
        {
            System.out.println("Insufficient amount or Invalid amount");
        }
     }
     public void checkbalance()
     {
        System.out.println(" BALANCE RS "+balance);
     }
     abstract void accountype();
}
//------------INHERITENCE-------------
class Savingsaccount extends Account1
{
    Savingsaccount(String name,double balance, int pin)
    {
        super(name,balance,pin);
    }
    @Override
    void accountype()
        {
            System.out.println(" Savings Account");
        }
}

    class currentaccount extends Account1
    {
       currentaccount(String name,double balance,int pin)
       {
        super(name,balance,pin);
       }
       @Override
       void accountype()
       {
        System.out.println("Cuurent Account");
       }
    }
    //---------MAIN------------
    public class ATM_Pin
    {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println(" Enter Initial balance");
        double balance=sc.nextDouble();
        System.out.println(" Set 4 Digit PIN :");
        int pin=sc.nextInt();
        System.out.println(" Choose Account type");
        System.out.println(" 1. Savings Account");
        System.out.println(" 2.Current Account");
        int choice=sc.nextInt();
        //---UPCASTING---
        Account1 account2;
        if(choice==1)
        {
            account2=new Savingsaccount(name,balance,pin);
        }
        else
        {
            account2=new currentaccount(name,balance,pin);
        }
    //---------PIN VALIDATION----------
    int attempts=3;
    boolean authenticate=false;
    while(attempts>0)
    {
        System.out.println(" Enter PIN :");
    
    int enteredpin=sc.nextInt();
    if(account2.validatePin(enteredpin))
    {
        authenticate=true;
        break;
    }
    else
    {
        attempts--;
        System.out.println(" WRONG PIN  ATTEMPTS LEFT :"+attempts);
    }
}
    if(! authenticate)
    {
        System.out.println("Account Locked!!!!!   Try Again later");
        return;
    }
    int option;
    do
    {
      System.out.println(" /  ATM MENU-----");
      System.out.println("1. Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Account Type");
      System.out.println(" 5. EXIT");
      option=sc.nextInt();
      switch(option)
      {
        case 1:
            account2.checkbalance();
            break;
        case 2:
            System.out.println(" Amount ");
            account2.deposit(sc.nextDouble());
            break;
        case 3:
            System.out.println(" Amount");
            account2.withdraw(sc.nextDouble());
            break;
        case 4:
            account2.accountype();
        case 5:
            System.out.println(" Thank You");
        default:
            System.out.println(" Invalid Option");
      }
    }while(option!=5);
    sc.close();
}

}
