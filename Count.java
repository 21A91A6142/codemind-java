import java.util.*;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int odd=0,even=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                even+=1;
            }
            else
            {
                odd+=1;
            }
        }
        System.out.print(even+" ");
        System.out.print(odd+" ");
    }
}