import java.util.*;
class Missing
{
    public static void main(String args[])
    {
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        int[] array=new int[n];
        int[] darray=new int[n+1];
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number:");
            num=sc.nextInt();
            array[i]=num;
        }
        for(int i=1;i<=n+1;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(array[j]==i)
                {
                    darray[i]=1;
                }
            }

        }
        for(int i=1;i<n+1;i++)
        {
            if(darray[i]!=1)
            {
                System.out.println("Missing Number:"+i);
                break;
            }
        }

    }
}