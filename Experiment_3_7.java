class Subtract_N
{
    double sub(int a,double b)
    {
        return a-b;
    }
    double sub(double a,int b)
    {
        return a-b;
    }
    public static void main(String args[])
    {
        Subtract_N obj=new Subtract_N();
        double sub1=obj.sub(5,4.0);
        double sub2=obj.sub(5.0,4);
        System.out.println("Subtraction 1:"+sub1);
        System.out.println("Subtraction 2:"+sub2);
    }
}
