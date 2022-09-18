import java.util.*;
class Vc
{
    public static void main(String args[])
    {
        char c;
        Scanner sc=new Scanner(System.in);
        c=sc.nextLine().charAt(0);
        if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u')
        {
            System.out.print("Vowel");
        }
        else
        {
            System.out.print("Consonant");
        }
    }
}