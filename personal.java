import java.util.*;

public class personal
{
    static int random1()
    {
        int x,i;
        int[] a= new int[20];
        for(i=0;i<20;i++)
        {
            a[i]= i+1;
        }
        x = (int)Math.floor(Math.random()*(a[19]-a[0]+1)+a[0]);
        System.out.println("the random number is : "+x);
        return 0;
    }
    static int random2()
    {
        int x,i;
        int[] a= new int[20];
        for(i=0;i<20;i++)
        {
            a[i]= i+21;
        }
        x = (int)Math.floor(Math.random()*(a[19]-a[0]+1)+a[0]);
        System.out.println("the random number is : "+x);
        return 0;
    }
    static int random3()
    {
        int x,i;
        int[] a= new int[20];
        for(i=0;i<20;i++)
        {
            a[i]= i+41;
        }
        x = (int)Math.floor(Math.random()*(a[19]-a[0]+1)+a[0]);
        System.out.println("the random number is : "+x);
        return 0;
    }
    public static void main(String[] args)
    {
        System.out.println("Choose the range for random number : ");
        System.out.println("1. random number between 1 and 20");
        System.out.println("2. random number between 21 and 40");
        System.out.println("3. random number between 41 and 60");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                random1();
                break;
            case 2:
                random2();
                break;
            case 3:
                random3();
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}