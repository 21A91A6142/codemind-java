import java.util.*;
class maxcons
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        int c=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                c+=1;
            }
            else
            {
                l.add(c);
                c=0;
            }
        }
        l.add(c);
        System.out.print(Collections.max(l));
    }
}