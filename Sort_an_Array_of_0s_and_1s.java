import java.util.*;
class sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            l.add(a[i]);
        }
        Collections.sort(l);
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
        
    }
}