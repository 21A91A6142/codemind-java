import java.util.*;
class Square
{
    public static void main(String args[])
    {
        int n,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=(int)Math.sqrt(n);
        String result=(n==a*a?"True":"False");
        System.out.print(result);
        sc.close();
    }
}