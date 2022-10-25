import java.util.*;
import java.util.ArrayList;
class Greatest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> a1=new ArrayList<>();
        int [] a=new int[n];
        int max=-999;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        int m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if((a[i]+m)>=max)
            {
                a1.add("True");
            }
            else{
                a1.add("False");
            }
        }
        for(int i=0;i<a1.size();i++)
        {
            System.out.print(a1.get(i)+" ");
        }
    }
}