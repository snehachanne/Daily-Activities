import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class operators
 {
  public static void main(String[] args) 
  {
      int ch,n1,ch1,n2,n3,n4,n5;
     System.out.println("Enter Your Choice\n 1:unary Operator\n 3:Binary operator \n 2:Ternary Operator\n ");
     Scanner in=new Scanner(System.in);
       ch=in.nextInt();
       switch(ch)
       {
        case 1:System.out.println("\nUnary Operators");
        System.out.println("\nEnter a no:");
        n1=in.nextInt();
        System.out.println("\nValue of no after increamentation is "+(n1++));
        System.out.println("\nValue of no after decreamentation is "+(n1--));
        break;
        case 2: System.out.println("\nBinary Operators:\n1.Arithmetic Operators\n2.Logical Operator\n3.Betwise Operator");
        ch1=in.nextInt();
            switch(ch1)
            {
            case 1: System.out.println("\nArithmetic Operators");
            System.out.println("\nEnter two nos:");
            n2=in.nextInt();
            n3=in.nextInt();
            System.out.println("Addition = "+(n2+n3));
            System.out.println("Substraction = "+(n2-n3));
            System.out.println("Multiplication = "+(n2*n3));
            System.out.println("Division = "+(n2/n3));
            System.out.println("Modulus = "+(n2%n3));
            break; 
            case 2:
            System.out.println("Logical Operators \n1. Logical And(&&) \n2. Logical Or(||) ");
            int ch3;
            System.out.println("Enter your choice to see the use of logical operators\n1. Find Greater no\n2. Check whether Entered no is prime or not");
            ch3=in.nextInt();
            switch(ch3)
            {
                case 1:System.out.println("\nEnter three nos to check greater no:");
                n2=in.nextInt();
                n3=in.nextInt();
                n4=in.nextInt();
                if(n2>n3 && n2>n4)
                {
                    System.out.println(n2+" is greater no");
                }
                else if(n3>n2 && n3>n4)
                {
                  System.out.println(n3+" is greater no");  
                }
                else
                {
                   System.out.println(n4+" is greater no"); 
                }
                break;
                case 2:
                System.out.println("Enter no:");
                n5=in.nextInt();
                if(n5%1==0 || n5%2==0 || n5%3==0 || n5%5==0 || n5%7==0 || n5%11==0 || n5%13==0 || n5%17==0)
                {
                    System.out.println(n5+" is prime no");
                }
                else 
                {
                    System.out.println(n5+" is not prime no");
                }
                break;
                default:
                System.out.println("Enter valid choice");
            }

           break;
           
        }
      break;
     case 3:System.out.println("Ternary operator");
           int a,b;
           System.out.println("Enter two no:");
           a=in.nextInt();
           b=in.nextInt();
           System.out.println("the greater no is"+(a>b?a:b));
           break;
           default:
           System.out.println("Invalide choice");
    }
 }   
}
