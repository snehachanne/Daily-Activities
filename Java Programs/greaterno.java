//IF:WAP to accept a no from user and display a square if no is divisible by 5.
import java.util.*;
class greaterno 
{
    public static void main(String args[])
    {
        int n1,n2,n3,n4,n5;
    System.out.println("Enter Five Numbers:");
    Scanner in=new Scanner(System.in);
    n1=in.nextInt();
    n2=in.nextInt();
    n3=in.nextInt();
    n4=in.nextInt();
    n5=in.nextInt();
    if(n1>n2 && n1>n3 && n1>n4 && n1>n5)
    {
        System.out.println(+n1+" is greater number");
    }
    else if(n2>n1 && n2>n3 && n2>n4 && n2>n5)
    {
        System.out.println(+n2+" is greater number");
    }
    else if(n3>n1 && n3>n2 && n3>n4 && n3>n5)
    {
        System.out.println(+n3+" is greater number");
    }
    else if(n4>n1 && n4>n2 && n4>n3 && n1>n5)
    {
        System.out.println(+n4+" is greater number");
    }
    else if(n5>n1 && n5>n2 && n5>n3 && n5>n4)
    {
        System.out.println(+n5+" is greater number");
    }
    else
    {
        System.out.println("Please Enter Different 5 nos");
    }

    }
}
