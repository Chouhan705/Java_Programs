import java.util.*;
import java.lang.*;

class ArrayPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] even = new int[100] ;
        int[] odd  = new int[100] ;
        int[] five = new int[100] ;
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("");
        int i ,j = 0 , k=0 ;
        for( i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                even[j]=i;
                j++;
            }
            else
            {
                odd[k]=i;  
                k++;
            }
        }
        System.out.println("even numbers till n("+n+")");
        for(i=0;i<j;i++)
        {
            System.out.print(even[i]+" ");
        }
        System.out.println("");
        System.out.println("odd numbers till n("+n+")");
        for(i=0;i<k;i++)
        {
            System.out.print(odd[i]+" ");
        }
        System.out.println("");
        System.out.println("numbers divisble by 5 till n("+n+")");
        for( i=1 ; i < n ; i++)
        {
            if(i*5<=n)
            {
            five[i] = i*5 ;
            System.out.print(five[i]+" ");
            }
            else
            {
                break;
            }
        }
        System.out.println("");
        int[] square = new int[100] ;
        System.out.println("squares till n("+n+")");
        for(i=1;i<n;i++)
        {
            square[i] = i*i ;
            System.out.print(square[i] + " ");
        }
        System.out.println("");
        System.out.println("square but now n("+n+") is capacity");
        int[] squarecap = new int[100];
        for(i=0 ;i<n ; i++)
        {
            if(i*i <= n)
            {
                squarecap[i] = i*i ;
                System.out.print(squarecap[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("the pattern of i raised to i till n("+n+")");
        double[] pattern = new double[100] ;
        double x=0 ;
        for(i=0;i<n;i++)
        {
            x++;
            pattern[i] = Math.pow(x , x);
            System.out.print(pattern[i]+" ");
        }
    }
}
