//IF:WAP to accept a no from user and display a square if no is divisible by 5.

import java.util.*;
import java.math.*;
class square 
{
    public static void main(String args[])
    {
        int no;
    System.out.println("Enter No:");
    Scanner in=new Scanner(System.in);
    no=in.nextInt();
    if(no%5==0)
    {
        System.out.println("Square of "+no+ " is "+(no*no));
    }
    else
    {
        System.out.println("No is not divisible by 5 ");
    }

    }
}
