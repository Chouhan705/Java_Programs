
public class MultipleCatch 
{
    public static void main(String args[]) 
    {   
    try 
    {
    int result = 10 /Integer.parseInt(args[0]);
    System.out.println("Result: " + result);
    } 
    catch (ArrayIndexOutOfBoundsException e) 
    {
    System.out.println("Please provide at least one argument");
    } 
    catch (NumberFormatException e) 
    {
    System.out.println("Invalid input: Please provide a valid integer");
    } 
    catch (ArithmeticException e) 
    {
    System.out.println("Division by zero: Cannot divide by zero");
    }
    
    }
}