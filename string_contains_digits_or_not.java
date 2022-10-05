import java.util.*;
class Strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s; 
        for(int i=0;i<n;i++)
        {
            int c=0;
            s=sc.next();
            char ch[]=s.toCharArray();
            for(int j=0;j<ch.length;j++)
            {
                if(Character.isDigit(ch[j]))
                {
                    c=c+1;
                }
            }
            if(c>0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}