import java.util.*;

public class everything
{
   
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
                case 2:
                
                 for (int i = 1; i <= length; i++) 
                 {
                     for (int j = 1; j <= i; j++) 
                     {
                      System.out.print("*");
                     }
                    System.out.println();
                }
                break;
            }
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
        int[][] m1 = new int[row][col];//matrix declaration for runtime
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
                System.out.print(m1[i][j] + " ");//transpose of square
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
            int temp=0;

            for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                {
                    if(row<col)
                    {
                    temp = m1[i][j];
                    m1[i][j] = m1[j][i];
                    m1[j][i] = temp;
                    }
                }
            }
            System.out.println("The Transpose of the matrix is :");
            for(i=0;i<col;i++)
            {
                for(j=0;j<row;j++)
                {
                    System.out.print(m1[j][i] + " ");//transpose of non square
                }
                System.out.println();//newline after each row
            }
        }
        break;

        }
        }

    }

    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);


        System.out.println("Select calculator or pattern genrator :");
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
        }

    }
}