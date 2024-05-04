import java.util.*;
import java.io.*;
import java.lang.*;

public class everything
{
   
    static void mainmenu()
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Select the tool to use :");
        System.out.println("1.Calculator");
        System.out.println("2.Pattern Generator");
        System.out.println("3.Matrix");
        System.out.println("4.Arrays");
        System.out.println("5.Clear Screen");
        System.out.println("6.String");

        int choice1 = sc.nextInt();
        switch(choice1)
        {
            case 1:
            calculator();
            break;
            case 2:
            pattern();
            break;
            case 3:
            matrix();
            break;
            case 4:
            array();
            break;
            case 5:
            System.out.println("\033[H\033[2J");
            break;
            case 6:
            string();
            break;
            default:
            System.out.println("Invalid Choice");
            break;

        }
    }
    static void calculator()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choices :");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("6.Power");
        System.out.println("Enter your Choice :");
        int choice2 = sc.nextInt();
        if(choice2>6)
        {
            System.out.println("Invalid Choice");
        }
        else
        {
         System.out.println("Enter number 1 :");
         int a = sc.nextInt();
         System.out.println("Enter number 2 :");
         int b = sc.nextInt();

         switch (choice2)
           {
               case 1:
                   System.out.println(a + " + " + b + " = " + (a + b));
                   break;
               case 2:
               if(a>b)
               {
                   System.out.println(a + " - " + b + " = " + (a - b));
               }
               if(a<b)
               {
                System.out.println(b + " - " + a + " = " + (b - a));
               }
                   break;
                case 3:
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case 4:
                if(b==0)
                {
                    System.out.priontln("Division not possible");
                }
                else
                {
                    System.out.println(a + " / " + b + " = " + (a / b));
                }
                    break;
                case 5:
                    System.out.println(a + " % " + b + " = " + (a % b));
                    break;
                case 6:
                    int c=1;
                    for(int i=0;i<b;i++)
                    {
                        c=c*a;
                    }
                    System.out.println(a + " ^ " + b + " = " + (c));
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        System.out.println("Do you want to continue? (y/n)");
        System.out.println("If you want to go back to main menu, Enter (b) \n");
        char ch = sc.next().charAt(0);
        if(ch=='y'||ch=='Y')
        {
            calculator();
        }
        if(ch=='n'||ch=='N')
        {
            System.out.println("THANK YOU!");
        }
        if(ch=='b'||ch=='B')
        {
            mainmenu();
        }
    }
    static void pattern()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the Pattern :");
        System.out.println("1.Square");
        System.out.println("2.Triangle");
        System.out.println("3.Up Side Down Trianlge");
        System.out.println("4.Mirrored Triangle");
        System.out.println("5.Diamond");
        int choice = sc.nextInt();
        if(choice>5)
        {
            System.out.println("Invalid Choice");
        }
        else
        {
            System.out.println("Enter the lenght of the pattern :");
            int length = sc.nextInt();
            System.out.println("");
            switch (choice)
            {
                case 1://square
                for (int i = 1; i <= length; i++)
                {
                    for (int j = 1; j <= length; j++) 
                    {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;

                case 2://triangle
                 for (int i = 1; i <= length; i++) 
                 {
                     for (int j = 1; j <= i; j++) 
                     {
                      System.out.print("*");
                     }
                    System.out.println();
                }
                break;
                case 3://up side down triangle
                for (int i = 1; i < length+2; i++)
                {
                    for (int j = 1; j < length-i+2; j++) 
                    {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
                case 4://mirrored traingle
                for (int i= 0; i<= length; i++)//outer loop    
                {  
                    for (int j=1; j<=length-i; j++)//print empty space because even patter is a matrix
                    {  
                    System.out.print(" ");
                    }  
                    for (int k=0;k<=i;k++)//for printing after empty space
                    {  
                        System.out.print("*");  
                    }   
                    System.out.println("");  
                } 
                break;
                case 5://diamond
                System.out.println("/\\ ");
                System.out.println("\\/ ");
                System.out.println("");
                System.out.println("Prank kardiye aapke sath ;)");
                System.out.println("");
                break;
                default:
                System.out.println("Invalid Choice");
                
                
            }  
        } 
        System.out.println("Do you want to continue? (y/n)");
        System.out.println("\nIf you wan to go back to the main menu, Enter (b) \n");
        char ch = sc.next().charAt(0);
        if(ch=='y'||ch=='Y')
        {
            pattern();
        }
        if(ch=='n'||ch=='N')
        {
            System.out.println("THANK YOU!");
        }
        if(ch=='b'||ch=='B')
        {
            mainmenu();
        }
    }
       

    static void matrix()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation to perform :");
        System.out.println("1.Transpose \n2.Addition \n3.Multiplication");
        int choice = sc.nextInt();
        int i,j,row,col;

        if(choice>3)
        {
            System.out.println("Invalid Choice");
        }
        else
        {
            switch (choice)
    {
                case 1:
        System.out.println("Enter the number of rows :");
        row = sc.nextInt();
        System.out.println("Enter the number of columns :");
        col = sc.nextInt();
        int[][] m1 = new int[10][10];//matrix declaration for runtime
        System.out.println("Enter the elements :");
        //loop for input of elements
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is :");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();//newline after each row
        }
        if(row==col)
        {
        System.out.println("The Transpose of the matrix is :");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(m1[j][i] + " ");//transpose of square
            }
            System.out.println();//newline after each row
        }
        }   
        else
        {
            int[][] temp=new int[10][10];
            if(row>col)
            {
            for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                {
                    if(i>j)
                    {
                    temp[i][j] = m1[i][j];
                    m1[i][j] = m1[j][i];
                    m1[j][i] = temp[i][j];
                    }
                }
            }
        }
        if(row<col)
        {
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(i<j)
                {
                temp[i][j] = m1[i][j];
                m1[i][j] = m1[j][i];
                m1[j][i] = temp[i][j];
                }
            }
        }
    }
            System.out.println("The Transpose of the matrix is :");
            for(i=0;i<col;i++)
            {
                for(j=0;j<row;j++)
                {
                    System.out.print(m1[i][j] + " ");
                }
                System.out.println();//newline after each row
            }

        }
        break;

        case 2:

        int[][] m2 = new int[10][10];
        int[][] m3 = new int[10][10];
        int[][] m4 = new int[10][10];
        System.out.println("Enter the number of rows :");
        row = sc.nextInt();
        System.out.println("Enter the number of columns :");
        col = sc.nextInt();
        System.out.println("Enter the elements for First Matrix :");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                m2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements for Second Matrix :");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                m3[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition of the two matrices is :");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                m4[i][j] = m2[i][j] + m3[i][j];
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(m4[i][j] + " ");
            }
            System.out.println();//newline after each row
        }
        break;
        
        case 3:
        int[][] m5 = new int[10][10];
        int[][] m6 = new int[10][10];
        int[][] m7 = new int[10][10];
        System.out.println("Enter the number of rows for matrix 1 :");
        int row1 = sc.nextInt();
        System.out.println("Enter the number of columns for matrix 1 :");
        int col1 = sc.nextInt();
        System.out.println("Enter the number of rows for matrix 2 :");
        int row2 = sc.nextInt();
        System.out.println("Enter the number of columns for matrix 2 :");
        int col2 = sc.nextInt();
        if (row1!=col2 && row2!=col1)
        {
            System.out.println("Multiplication not possible");
        }
        if (row1==col2 && row2==col1)
        {
            System.out.println("Enter the elements for First Matrix :");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    m5[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements for Second Matrix :");
            for(i=0;i<row2;i++)
            {
                for(j=0;j<col2;j++)
                {
                    m6[i][j] = sc.nextInt();
                }
            }
            System.out.println("The first matrix is :");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    System.out.print(m5[i][j]+"");
                }
                System.out.println();
            }
            System.out.println("The second matrix is :");
            for(i=0;i<row2;i++)
            {
                for(j=0;j<col2;j++)
                {
                    System.out.print(m6[i][j]+"");
                }
                System.out.println();
            }
            System.out.println("Multiplication of the two matrices is :");

            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    m7[i][j]=0;
                    for(int k=0;k<row2;k++)
                    {
                        m7[i][j] =m7[i][j]+(m5[i][k] * m6[k][j]);
                    }
                }
            }
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    System.out.print(m7[i][j] + " ");
                }
                System.out.println();
            }   

        }
        if(row2==col1&&row1!=col2)
        {
            System.out.println("Enter the elements for First Matrix :");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    m5[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements for Second Matrix :");
            for(i=0;i<row2;i++)
            {
                for(j=0;j<col2;j++)
                {
                    m6[i][j] = sc.nextInt();
                }
            }
            System.out.println("The first matrix is :");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    System.out.print(m5[i][j]+"");
                }
                System.out.println();
            }
            System.out.println("The second matrix is :");
            for(i=0;i<row2;i++)
            {
                for(j=0;j<col2;j++)
                {
                    System.out.print(m6[i][j]+"");
                }
                System.out.println();
            }
            System.out.println("Multiplication of the two matrices is :");

            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    m7[i][j]=0;
                    for(int k=0;k<row2;k++)
                    {
                        m7[i][j] =m7[i][j]+(m5[i][k] * m6[k][j]);
                    }
                }
            }
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    System.out.print(m7[i][j] + " ");
                }
                System.out.println();
            }   

        }
        if(row1==col2 && row2!=col1)
        {
            int temp1=0,temp2=0;
            row1=temp1;
            row1=row2;
            row2=temp1;
            col1=temp2;
            col1=col2;
            col2=temp2;
            System.out.println("Enter the elements for First Matrix :");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    m5[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements for Second Matrix :");
            for(i=0;i<row2;i++)
            {
                for(j=0;j<col2;j++)
                {
                    m6[i][j] = sc.nextInt();
                }
            }
            System.out.println("The first matrix is :");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    System.out.print(m5[i][j]+"");
                }
                System.out.println();
            }
            System.out.println("The second matrix is :");
            for(i=0;i<row2;i++)
            {
                for(j=0;j<col2;j++)
                {
                    System.out.print(m6[i][j]+"");
                }
                System.out.println();
            }
            System.out.println("Multiplication of the two matrices is :");

            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    m7[i][j]=0;
                    for(int k=0;k<row1;k++)
                    {
                        m7[i][j] =m7[i][j]+(m5[i][k] * m6[k][j]);
                    }
                }
            }
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    System.out.print(m7[i][j] + " ");
                }
                System.out.println();
            } 
        }
        break;
    }
    }
    System.out.println("Do you want to continue? (y/n)");
    System.out.println("\nIf you wan to go back to the main menu, Enter (b) \n");
    char ch = sc.next().charAt(0);
    if(ch=='y'||ch=='Y')
    {
        matrix();
    }
    if(ch=='n'||ch=='N')
    {
        System.out.println("THANK YOU!");
    }
    if(ch=='b'||ch=='B')
    {
        mainmenu();
    }
    }
    static void array()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation to perform :");
        System.out.println("1: Ascending order sorting");
        System.out.println("2: Decending order sorting");
        System.out.println("3: Greatest element from array");
        System.out.println("4: Smallest element from array");

        int choice =sc.nextInt();
        int [] a1 = new int[100];
        int [] a2 = new int[100];
        int [] a3 = new int[100];
        int i,j;
        switch(choice)
        {
            case 1:
            System.out.println("Enter the number of elements in the array :");
            int size = sc.nextInt();
            System.out.println("\nEnter the elements in the array :");
            for(i=0;i<size;i++)
            {
                a1[i] = sc.nextInt();
            }
            System.out.println("\nThe array is :");
            for(i=0;i<size;i++)
            {
                System.out.print(a1[i]+" ");
            }
            System.out.println("\nThe array sorted in an ascending order is :");
            int small;
            for(i=0;i<size;i++)
            {
                for(j=0;j<size-i-1;j++)
                {
                if(a1[j] > a1[j+1])
                {
                    small = a1[j];
                    a1[j] = a1[j+1];
                    a1[j+1] = small;
                }
            }
            }
            for(i=0;i<size;i++)
            {
                System.out.print(a1[i]+" ");
            }
            break;

            case 2:
            System.out.println("Enter the number of elements in the array :");
            size = sc.nextInt();
            System.out.println("\nEnter the elements in the array :");
            for(i=0;i<size;i++)
            {
                a1[i] = sc.nextInt();
            }
            System.out.println("\nThe array is :");
            for(i=0;i<size;i++)
            {
                System.out.print(a1[i]+" ");
            }
            System.out.println("\nThe array sorted in a descending order is :");
            int big;
            for(i=0;i<size;i++)
            {
                for(j=0;j<size-i-1;j++)
                {
                if(a1[j] < a1[j+1])
                {
                    big = a1[j];
                    a1[j] = a1[j+1];
                    a1[j+1] = big;
                }
            }
            }
            for(i=0;i<size;i++)
            {
                System.out.print(a1[i]+" ");
            }
            break;

            case 3:
            
                System.out.println("Enter the number of elements in the array :");
                size = sc.nextInt();
                System.out.println("\nEnter the elements in the array :");
                for(i=0;i<size;i++)
                {
                    a1[i] = sc.nextInt();
                }
                System.out.println("\nThe array is :");
                for(i=0;i<size;i++)
                {
                    System.out.printf(a1[i]+" ");
                }
                System.out.println(" ");

                int greatest = a1[0];
                i = 0;
                for(i=0;i<size;i++)
                {
                    if(a1[i] > greatest)
                    {
                    greatest=a1[i];
                    }
                }

                System.out.println("The greatest element in the array is : "+ greatest);

                break;
                case 4:
            
                System.out.println("Enter the number of elements in the array :");
                size = sc.nextInt();
                System.out.println("\nEnter the elements in the array :");
                for(i=0;i<size;i++)
                {
                    a1[i] = sc.nextInt();
                }

                System.out.println("\nThe array is :");
                for(i=0;i<size;i++)
                {
                    System.out.print(a1[i]+" ");
                }

                System.out.println(" ");

                int smallest = a1[0];
                i = 0;
                for(;i<size;i++)
                {
                    if(a1[i] < smallest)
                    {
                    smallest=a1[i];
                    }
                }

                System.out.println("The greatest element in the array is : "+ smallest);

                break;

        }
        System.out.println("\n\nDo you want to continue? (y/n)");
        System.out.println("\nIf you want to go back to the Main Menu, Enter (b) \n");
        char ch = sc.next().charAt(0);
        if(ch=='y'||ch=='Y')
        {
            array();
        }
        if(ch=='n'||ch=='N')
        {
            System.out.println("THANK YOU!");
        }
        if(ch=='b'||ch=='B')
        {
            mainmenu();
        }
    }
    static void string()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation to perform :");
        System.out.println("1: String length");
        System.out.println("2: String Separator");
        System.out.println("3: String comparison");
        System.out.println("4: String reverse");
        System.out.println("5: String substring");
        System.out.println("6: Palindrome check");
        System.out.println("7: String Concatenation");
        int choice = sc.nextInt();
        String s1,s2,s3;
        switch(choice)
        {
            case 1:
            System.out.println("Enter the string :");
            s1 = sc.next();
            System.out.println("The length of the string is : "+s1.length());
            break;

            case 2:
            System.out.println("Enter the strings with fullstop(.) as the partition in between");
            s1=sc.next();
            String breaker="[.]";
            String[] result2=s1.split(breaker);
            for(int i=0;i<result2.length;i++)
            {
                System.out.println(result2[i]);
            }

            break;

            case 3:
            System.out.println("Enter the first string :");
            s1 = sc.next();
            System.out.println("Enter the second string :");
            s2 = sc.next();
            boolean result1 = s1.equals(s2);
            if(result1 == true)
            {
                System.out.println("The compared strings are the same ");
            }
            else
            {
                System.out.println("The compared strings are different ");
            }
            break;

            case 4:
            System.out.println("Enter the string :");
            s1 = sc.next();
            s2="";
            for(int i=s1.length()-1;i>=0;i--)
            {
                s2 = s2 + s1.charAt(i);
            }
            System.out.println("The reversed string is : "+s2);
            break;

            case 5:
            System.out.println("Enter the string :");
            s1 = sc.next();
            System.out.println("Enter the substring indexes :");
            System.out.println("(The string starts from the first index value goes till the second index value that itself is not included)");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("The substring is : "+s1.substring(a,b));
            break;

            case 6:
            System.out.println("Enter the string :");
            s1 = sc.next();
            s2="";
            for(int i=0;i<s1.length();i++)
            {
                s2 = s2 + s1.charAt(i);
            }
            boolean result = s1.equals(s2);

            if(result)
            {
                System.out.println("The string is a palindrome");
            }
            else
            {
                System.out.println("The string is not a palindrome");
            }
            break;

            case 7:
            System.out.println("Enter the number of strings :");
            int n = sc.nextInt();
            String result3 ="";
            for(int i=0 ; i<n;i++)
            {
                System.out.println("Enter the string :");
                s1 = sc.next();
                result3 = result3 + s1 + " ";
            }
            System.out.println(result3);

            break;

            default:
            System.out.println("Invalid choice");
            
        }

        System.out.println("Do you want to continue? (y/n)");
        System.out.println("\nIf you wan to go back to the main menu, Enter (b) \n");
        char ch = sc.next().charAt(0);
        if(ch=='y'||ch=='Y')
        {
            string();
        }
        if(ch=='n'||ch=='N')
        {
            System.out.println("THANK YOU!");
        }
        if(ch=='b'||ch=='B')
        {
            mainmenu();
        }


    }


    public static void main(String[] args)
    {   
        mainmenu();
    }
}
