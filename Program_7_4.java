import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        int sum=0;
        int rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int dnum=num;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            sum=sum*10;
            sum=sum+rem;
        }
        if(sum==dnum)
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }

    }
}