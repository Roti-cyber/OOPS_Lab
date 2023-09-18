import java.util.*;
class Employee
{
    static void print(String name,String address,int age,char gender)
{
    System.out.println("Name:"+name);
    System.out.println("Address:"+address);
    System.out.println("Age:"+age);
    System.out.println("Gender:"+gender);
}
public static void main(String args[])
{
    String name="Rohith";
    String address="Coimbatore";
    int age=18;
    char gender='M';
    print(name,address,age,gender);

}
}