import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for(int i=2;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial is:"+fact)    ;

    }
}
