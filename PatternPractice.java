//Q1
//INPUT : 5
//OUTPUT
/*
12345
23451
34512
45123
51234
*/ 

//Q2
//INPUT : 5
//OUTPUT
/*
    1
   21
  321
 4321
54321
*/ 

//Q3
//INPUT : 5
//OUTPUT
/*
            1
          2 4
        3 5 7
    6 8 10 12
9 11 13 15 17
*/

//Q4
//INPUT : 5
//OUTPUT
/*
555555555
544444445
543333345
543222345
543212345
543222345
543333345
544444445
555555555
*/

//Q5
//INPUT : 5
//OUTPUT
/*
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
*/

import java.lang.*;
import java.util.*;
public class PatternPractice
{
    static int i , j;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");  
        int num = scanner.nextInt();
        scanner.close();
        Q1(num);
        Q2(num);
        Q3(num);
        Q4(num);
        Q5(num);
    }
    
    public static void Q1(int num)
    {
        System.out.println("Q1 \n");
        for (i = 1; i < num+1; i++)
        {
            for(j=i; j < num+1; j++)
            {
                System.out.print(j);
            }
            for(j=1; j < i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("");
    }
    
    public static void Q2(int num)
    {
        System.out.println("Q2 \n");



        System.out.println("");
    }
    
    public static void Q3(int num)
    {
        System.out.println("Q3 \n");



        System.out.println("");
    }
    
    public static void Q4(int num)
    {
        System.out.println("Q4 \n");
        int len=0;
        for(int counter = 1 ;counter < num+1 ; counter++)
        {
            len++;
        }
        len=(2*len)-1;
        int[][] pattern = new int[len][len];
        i = 0;
        j = 0;
        for(int counter = num ; counter > 0 ; counter--)
        {
            int k,l;
            for(k=i;k<len;k++)
            {
                for(l=j;l<len;l++)
                { 
                    pattern[k][l] = counter;
                    if(k+l>len-1)
                    {
                        pattern[k][l] = pattern[len-1-k][len-1-l];
                    }
                    
                }
            }
            i++;
            j++;
        }
        for(i=0;i<len;i++)
        {
            for(j=0;j<len;j++)
            {
                System.out.print(pattern[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("");
    }
    
    public static void Q5(int num)
    {
        System.out.println("Q5 \n");



        System.out.println("");
    }
}
