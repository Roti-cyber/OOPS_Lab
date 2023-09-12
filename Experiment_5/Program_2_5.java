import java.util.*;
class MaxandMin
{
    public static void main(String args[])
    {
        int num=0,sum=0,max=0,min=0;
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter a number:");
            num=sc.nextInt();
            array[i]=num;

        }
        max=array[0];
        min=array[0];
        for(int i=0;i<5;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        sum=min+max;
        System.out.println("Sum:"+sum);
    }
}
