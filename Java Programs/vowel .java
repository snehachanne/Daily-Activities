//switch case: Accept chacter from user and check it is vowel or not
import java.util.*;
class vowel
{
  
      public static void main(String[] args)
      {
       char c;
       System.out.println("Enter any character");
       Scanner in=new Scanner(System.in);
       c=in.next().charAt(0);
       switch(c)
       {
           case 'a': System.out.println(c+ " is vowel");
           break;
           case 'e': System.out.println(c+ " is vowel");
           break;
           case 'i': System.out.println(c+ " is vowel");
           break;
           case 'o': System.out.println(c+ " is vowel");
           break;
           case 'u': System.out.println(c+ " is vowel");
           break;
           case 'A': System.out.println(c+ " is vowel");
           break;
           case 'E': System.out.println(c+ " is vowel");
           break;
           case 'I': System.out.println(c+ " is vowel");
           break;
           case 'O': System.out.println(c+ " is vowel");
           break;
           case 'U': System.out.println(c+ " is vowel");
           break;
           default:
           System.out.println(c+ " is not vowel");    
       } 
      }
  
}
