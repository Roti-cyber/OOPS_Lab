import java.util.*;
class Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=2;i<=num;i=i+2)
        {
            sum=sum+i;
        }
        System.out.println("The sum is:"+sum);
    }
}
