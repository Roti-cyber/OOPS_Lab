import java.util.*;
class Bank
{
   
    static String bank_customer()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name:");
        String f_name=sc.nextLine();
        System.out.println("Enter Last Name:");
        String l_name=sc.nextLine();
        String name=f_name+" "+l_name;
        return name;
    }
    static  void bank_account(String name)
    {
        Scanner sc=new Scanner(System.in);
        String customer=name;
        System.out.println("Enter your balance:");
        double balance=sc.nextDouble();

    }
    public static void main(String args[])
    {
        Bank acc_1=new Bank();
        String name=acc_1.bank_customer();
        acc_1.bank_account(name);
        acc_1.bank_account(name);
    }
}
