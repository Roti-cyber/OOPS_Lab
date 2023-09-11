import java.util.*;
class Array
{
    public static void main(String args[])
    {
        int num=0,sum=0;
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter a number:");
            num=sc.nextInt();
            array[i]=num;
            sum=sum+array[i];
        }
        System.out.println("Sum of numbers is:"+sum);
        
    }
}