import java.util.*;
class Color
{
    public static void main(String args[])
    {
        char c;
        Scanner sc=new Scanner(System.in);
        c=sc.nextLine().charAt(0);
        if(c=='V' || c=='v')
        {
            System.out.print("Violet");
        }
        else if(c=='I' || c=='i')
        {
            System.out.print("Indigo");
        }
        else if(c=='B' || c=='b')
        {
            System.out.print("Blue");
        }
        else if(c=='G' || c=='g')
        {
            System.out.print("Green");
        }
        else if(c=='Y' || c=='y')
        {
            System.out.print("Yellow");
        }
        else if(c=='O' || c=='o')
        {
            System.out.print("Orange");
        }
        else if(c=='R' || c=='r')
        {
            System.out.print("Red");
        }
        else
        {
            System.out.print("-1");
        }
    }
}