import java.util.*;
class vcds
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char ch[]=s1.toCharArray();
        int v=0,s=0,d=0,c=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a' || ch[i]=='A' || ch[i]=='e' || ch[i]=='E' || ch[i]=='i' ||ch[i]=='I' || ch[i]=='o' || ch[i]=='O' || ch[i]=='u' || ch[i]=='U')
            {
                v=v+1;
            }
            else
            {
                c=c+1;
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isDigit(ch[i]))
            {
                d=d+1;
            }
            else if(ch[i]==' ')
            {
                s=s+1;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+(c-d-s));
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+s);
    }
}