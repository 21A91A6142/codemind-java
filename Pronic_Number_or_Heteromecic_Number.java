import java.util.*;
class Pronic
{
    public static void main(String args[])
    {
        int a,c=0,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=1;i<a;i++)
        {
            if((i)*(i+1)==a)
            {
                System.out.print("YES");
                c=c+1;
                break;
            }
        }
        if(c!=1)
        {
            System.out.print("NO");
        }
    }
}