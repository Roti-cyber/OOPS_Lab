import java.util.*;
class Insert
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int num=0;
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position where you want element to be inserted:");
        int pos=sc.nextInt();
        System.out.println("Enter element to be inserted:");
        int ele=sc.nextInt();
        for(int j=n-1;j>=pos;j--)
        {
           
            arr[j+1]=arr[j];
        }
        arr[pos]=ele;
        for(int i=0;i<n+1;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
