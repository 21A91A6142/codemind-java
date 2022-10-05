import java.util.*;
class Strin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int c=0;
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