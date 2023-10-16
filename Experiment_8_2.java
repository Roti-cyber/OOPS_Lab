import java.util.*;
abstract class Library_Management
{
   String Book_ls[]=new String[100];
    void get_book(String Book)
    {
        for(int i=0;i<100;i++)
        {
            if(Book_ls[i]==null)
            {
                Book_ls[i]=Book;
                break;
            }
        }
    }
    void display()
    {
        for(int i=0;i<100;i++)
        {
            if(Book_ls[i]!=null)
            {
                System.out.println(Book_ls[i]);

            }
            else
            {
                break;
            }
        }
    }
}
