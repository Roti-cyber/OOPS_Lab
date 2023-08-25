import java.util.*;
class two_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        System.out.println("Enter another number:");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("The bigger number is:"+a);
        }
        else
        {
            System.out.println("The bigger number is:"+b);
        }
        sc.close();
    }
}