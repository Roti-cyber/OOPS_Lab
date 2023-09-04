import java.util.*;

class break_stmt
{
    public static void main(String args[])
    {
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter a number:");
            num = sc.nextInt();
            if (num > 0)
            {
                sum = sum + num;
            }
            else
            {
                break;
            }
        }
        System.out.println("Sum is:" + sum);
    }
}
