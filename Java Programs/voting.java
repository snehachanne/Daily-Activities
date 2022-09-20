//If else: WAP to accept age from user and chech eligble for voting or not.
import java.util.*;
public class voting {
    public static void main(String args[])
    {
        int age;
    System.out.println("Enter No:");
    Scanner in=new Scanner(System.in);
    age=in.nextInt();
    if(age>=18)
    {
        System.out.println("Person is eligible for voting");
    }
    else
    {
        System.out.println("Person is not eligible for voting");
    }

    }
}
