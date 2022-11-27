import java.util.*;
class roy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int w=sc.nextInt();
            int h=sc.nextInt();
            if(w<l || h<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                if(w==h)
                {
                    System.out.println("ACCEPTED");
                }
                else
                {
                    System.out.println("CROP IT");
                }
            }
        }
    }
}