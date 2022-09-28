/*WAP to enter student name and five subject marks display the grade of student*/
package abc;
import java.util.*;
public class student_grade 
{
  
    public void disp(String n,int m[])// used parameterized function
    {
    	String sname=n;
    	int sub[]=m,i,total=0;
    	for(i=0;i<m.length-1;i++)
    	{
    	total=total+m[i];	
    	}
    	double per=total/5;
    	if(per>=35 && per<45)  // to find grade we used if else ladder and logical and operator
    	{
    		System.out.println("Student is pass");
    	}
    	else if(per>=45 && per<60)
    	{
    		System.out.println("Student is pass with second class");
    	}
    	else if(per>=60 && per<75 )
    	{
    		System.out.println("Student is pass with first class");	
    	}
    	else if(per>=75 && per<85 )
    	{
    		System.out.println("Student is pass with distinction class");	
    	}
    	else if(per>=85 && per<=100 )
    	{
    		System.out.println("Student is pass with Merit class");	
    	}
    	else
    	{
    		System.out.println("student is fail");
    	}
    	
    }
	public static void main(String[] args) 
	{
		student_grade sg=new student_grade();

    	Scanner sc=new Scanner(System.in);
		int i;
		int marks[]=new int[5];
		String name;
		System.out.println("Enter student name");
		name=sc.next();
		System.out.println("Enter 5 subject marks:");
		for(i=0;i<5;i++)            // used for loop to enter 5 sub marks
		{
			marks[i]=sc.nextInt();
		}
		sg.disp(name, marks); // called disp function by passing name of student n subject marks
		
	}

}
