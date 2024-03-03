import java.util.*;

public class everything
{
   
    static void mainmenu()
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Select the tool to use :");
        System.out.println("1.Calculator");
        System.out.println("2.Pattern Generator");
        System.out.println("3.Matrix");
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
         System.out.println("Enter two number :");
         int a = sc.nextInt();
         int b = sc.nextInt();

         switch (choice2)
           {
               case 1:
                   System.out.println(a + " + " + b + " = " + (a + b));
                   break;
               case 2:
                   System.out.println(a + " - " + b + " = " + (a - b));
                   break;
                case 3:
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case 4:
                    System.out.println(a + " / " + b + " = " + (a / b));
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
        System.out.println("If you want to go back to main menu, enter B");
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
            }  
        } 
        System.out.println("Do you want to continue? (y/n)");
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

    public static void main(String[] args)
    {   
        mainmenu();
    }
}
