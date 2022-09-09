import java.util.Scanner;
class hand
{
    public static void main(String args[])
    {
        int n,s;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=(n*(n-1))/2;
        System.out.println(s);
        sc.close();
    }
}