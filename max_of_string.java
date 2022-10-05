import java.util.*;
class MAx
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        char m='0';
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>m)
            {
                m=ch[i];
            }
        }
        System.out.print(m);
    }
}