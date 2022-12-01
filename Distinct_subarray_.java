import java.util.*;
class distinct
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        for(int i=n;i<=m;i++)
        {
            if(i%2!=0)
            {
                c=c+1;
            }
            l.add(i);
        }
        for(int i=0;i<l.size()-1;i++)
        {
            for(int j=i+1;j<l.size();j++)
            {
                int s=0;
                for(int k=i;k<j+1;k++)
                {
                    s+=l.get(k);
                }
                if(s%2!=0)
                {
                    c=c+1;
                }
            }
        }
        System.out.print(c);
    }
}