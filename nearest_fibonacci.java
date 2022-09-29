import java.util.*;
class nearest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b=0,c=0,i,n3;
        a=sc.nextInt();
        int n1=0,n2=1;
        for(i=2;i<a;i++)
        {
            n3=n1+n2;
            
            if(n3>a)
            {
                b=n3;
                c=n2;
                break;
            }
            n1=n2;
            n2=n3;
        }
        /*System.out.println(a);
        System.out.print(b+" "+c);*/
        if((c-a)>(a-b))
        {
            System.out.print(c);
        }
        else if((c-a)==(a-b))
        {
            System.out.print(c+" "+b);
        }
        else
        {
            System.out.print(b);
        }
    }
}