class Subtract
{
    int sub(int a,int b)
    {
        return a-b;
    }
    double sub(double a,double b)
    {
        return a-b;
    }
    public static void main(String args[])
    {
        Subtract obj=new Subtract();
        int sub1=obj.sub(5,4);
        double sub2=obj.sub(5.0,4.0);
        System.out.println("Subtract two integers:"+sub1);
        System.out.println("Subtract two double numbers:"+sub2);
    }
}
