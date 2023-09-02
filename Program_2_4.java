import java.util.*;
class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=0;
        double r=0;
        System.out.println("Enter the value of r:");
        r=sc.nextDouble();
        a=3.14*r*r;
        System.out.println("Area:"+a);

    }
}