import java.util.Scanner;
class temper
{
    public static void main(String args[])
    {
        int c;
        float f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=(float)(32+(c*9/5.0));
        System.out.format("%.2f",f);
        sc.close();
    }
}