import java.util.*;
abstract class Accounts
{
    double bal;
    String acc_no;
    String acc_hol;
    String add;
    abstract void withdrawl();
    abstract void deposit();
    void display()
    {   
        System.out.println("Balance:"+bal);
    }
}

class SavingsAccount extends Accounts
{
    Scanner sc=new Scanner(System.in);
    double roi=0.05;
    void cal_amt()
    {
        System.out.println("Prinicipal:"+bal);
        System.out.println("Rate of Interest:"+roi);
        double inr=bal*roi;
        System.out.println("Interest:"+inr);
    }
    void deposit()
    {
        System.out.println("Enter the amount to be deposited:");
        double dep=sc.nextDouble();
        bal=dep+bal;
        System.out.println("Amount after deposit:"+bal);

    }
    void withdrawl()
    {
        System.out.println("Enter the amount to be withdrawn:");
        double with=sc.nextDouble();
        bal=bal-with;
        System.out.println("Balance after withdrawl:"+bal);
    }

}

class Execute
{
    public static void main(String args[])
    {
        SavingsAccount cust1=new SavingsAccount();
        cust1.deposit();
        cust1.withdrawl();
        cust1.cal_amt();
        cust1.display();
    }
}