
import java.util.Scanner;
public class insertion
{
    public static void main(String args[])
    {
        int a[]=new int[30];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
         a=new int[n];
        int i;
        System.out.println("enter the elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=1;j<n;j++)
        {
            int key=a[j];
            int k=j-1;
            while((k>-1)&&(a[k]>key))
            {
                a[k+1]=a[k];
                k--;
            }
            a[k+1]=key;
        }
         for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}