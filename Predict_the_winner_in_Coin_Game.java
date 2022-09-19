import java.util.*;
class Pwc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        if(m%2==0 || n%2==0)
        {
            System.out.print("Player 1");
        }
        else
        {
            System.out.print("Player 2");
        }
    }
}