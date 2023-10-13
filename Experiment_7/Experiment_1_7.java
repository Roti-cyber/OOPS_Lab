class Add
{
    int sum(int a,int b)
    {
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        Add obj=new Add();
        int sum1=obj.sum(5,4);
        int sum2=obj.sum(5,4,5);
        System.out.println("Sum of two numbers:"+sum1);
        System.out.println("Sum of three numbers:"+sum2);
    }
}


