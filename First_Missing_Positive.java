import java.util.*;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            l.add(a[i]);
        }
        for(int i=1;i<=l.size();i++)
        {
            if(l.contains(i))
            {
                continue;
            }
            else
            {
                System.out.print(i);
                break;
            }
        }
    }
}