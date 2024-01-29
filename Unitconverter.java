import java.util.*;
public class Unitconverter
{
	public static void main(String[] args) 
	{
	    System.out.println("Welcome to THE Unit Converter");
	    System.out.println("Select desired Quantity");
	    System.out.println("");
	    System.out.println("1 : Length");
	    System.out.println("2 : Weight");
	    System.out.println("3 : Tempreture");
	    Scanner check = new Scanner(System.in);
	    int q=check.nextInt();
	     switch(q)
	     {
	         case 1: 
	         {
	         length(q);
	         } break;
	           case 2: 
	         {
	         System.out.println("Weight");
	         } break;
	           case 3: 
	         {
	         System.out.println("Temp");
	         } break;
	     }
	}


    public static int length (int q)
{
    System.out.println("Choose the Quantity to convert");
    System.out.println("");
    System.out.println("1 : Meters");
    System.out.println("2 : Centimeters");
    System.out.println("3 : Kilometers");
    Scanner check = new Scanner(System.in);
    
    int i=check.nextInt();
    switch(i)
	     {
	         case 1: 
	         {
	         System.out.println("Enter the Length in Meters");
	         } break;
	           case 2: 
	         {
	         System.out.println("Enter the Length in Centimeters");
	         } break;
	           case 3: 
	         {
	         System.out.println("Enter the Length in Kilometers");
	         } break;
	     }
	 float l1=check.nextInt();
	 
	System.out.println("Choose the Quantity to convert to");
    System.out.println("");
    System.out.println("1 : Meters");
    System.out.println("2 : Centimeters");
    System.out.println("3 : Kilometers");
    
    int f = check.nextInt();
    float l2=0;
    
    if(i==1)
    {
        switch(f)
	     {
	           case 2: 
	         {
	             l2=l1*100;
	         System.out.println("After conversion the length is :" +l2);
	         } break;
	           case 3: 
	         {
	             l2=l1/1000;
	         System.out.println("After conversion the length is :" +l2);
	         } break;
	     }
    }
    if(i==2)
    {
        switch(f)
	     {
	           case 1: 
	         {
	             l2=l1/100;
	         System.out.println("After conversion the length is :" +l2);
	         } break;
	           case 3: 
	         {
	             l2=l1/100000;
	         System.out.println("After conversion the length is :" +l2);
	         } break;
	     }
    }
    if(i==3)
    {
        switch(f)
	     {
	           case 1: 
	         {
	             l2=l1*1000;
	         System.out.println("After conversion the length is :" +l2);
	         } break;
	           case 2: 
	         {
	             l2=l1*100000;
	         System.out.println("After conversion the length is :" +l2);
	         } break;
	     }
    }
    return 0;
  
}
}
