import java.util.*;
class Counting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        char ch1[]=s.toCharArray();
        int c=0;
        for(int i=0;i<ch1.length;i++)
        {
            if(ch==ch1[i])
            {
                c=c+1;
            }
        }
        if(c>0)
        {
            System.out.print(c);
        }
        else
        {
            System.out.print("-1");
        }
    }
}