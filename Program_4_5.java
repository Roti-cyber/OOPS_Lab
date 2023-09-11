import java.util.*;
class Maximum_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter number of elements:");
        n=sc.nextInt();
        int[] arr=new int[n];
        int num,c=1;
        int max_num=0;
        int max_count=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element:");
            num=sc.nextInt();
            arr[i]=num;
        }
        for(int i=0;i<n;i++)
        {
            num=arr[i];
            for(int j=0;j<n;j++)
            {
                if(arr[j]==num)
                {
                    
                    c++;
                }
            }
            if(max_count<c)
            {
                max_count=c;
                max_num=num;
            }
            c=0;
        }
        System.out.println("The major elemnt is:"+max_num);

    }
}