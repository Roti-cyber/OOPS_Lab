import java.util.*;
class Odd_Even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num==0)
        {
            System.out.println("Zero");
        }
        else if(num%2!=0)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }

    }
}