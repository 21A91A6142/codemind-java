import java.util.*;
class Numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isDigit(ch[i]))
            {
                c+=ch[i]-'0';
            }
        }
        System.out.print(c);
    }
}