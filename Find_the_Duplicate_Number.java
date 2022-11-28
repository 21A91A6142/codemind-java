import java.util.*;
class finddupli
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        int k;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            l.add(a[i]);
        }
        for(int i=0;i<l.size();i++)
        {
            k=l.get(i);
            if(Collections.frequency(l,k)>1)
            {
                System.out.println(k);
                break;
            }
        }
        
    }
}