package abc;
import java.util.*;

public class pattern1 
{
	Scanner sc=new Scanner(System.in);
	   /*  
	   ***
	  *****
	 *******
	*********/
	void p1() 
	{
		int i,j;
		
		int size;
		System.out.println("Enter the size:");
		size=sc.nextInt();
		for(i=1;i<=size;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++)
			{  
				System.out.print("*");
			}
			System.out.println();	
	    }
	}
	/*10101
	 0101
	  101
	   01
	    1*/

	void p2() 
	{
		int i,j;
		
		int size;
		System.out.println("Enter the size:");
		size=sc.nextInt();
		for(i=size;i>=0;i--)
		{
			for(int k=size;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=i;j>=0;j--)
			{  
				if(j%2==0)
				System.out.print("0");
				else
			    System.out.print("1");
			}
			System.out.println();	
	    }
	}
	 /* 1
	   12
	  123
	 1234
	12345*/

	void p3() 
	{
		int i,j;
		
		int size;
		System.out.println("Enter the size:");
		size=sc.nextInt();
		for(i=1;i<=size;i++)
		{
			for(int k=i;k<=size;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{  
				System.out.print(j);
			}
			System.out.println();	
	    }
	}
/*	A
	BC
	DEF
	GHIJ
	KLMNO*/
	void p4()
	{
	
	int size,i,j;
	System.out.println("Enter the size:");
	size=sc.nextInt();
	int ch=65;
	for(i=1;i<=size;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print((char)ch);
			ch++;
		}
		System.out.println();
	}

	}
/*	A
	AB
	ABC
	ABCD
	ABCDE*/
	void p5()
	{
	
	int size,i,j;
	System.out.println("Enter the size:");
	size=sc.nextInt();
	int ch=65;
	for(i=1;i<=size;i++)
	{
		ch=65;
		for(j=1;j<=i;j++)
		{
			System.out.print((char)ch);
			ch++;
			
		}
		System.out.println();
	}

	}
	//WAP to print 1 to 10 table
	void table()
	{
		int i,j;
		for(i=1;i<=10;i++)
		{
			System.out.println();
			for(j=1;j<=10;j++)
			{
				System.out.print("\t");
				System.out.print(i*j);
			}
			
		}
		System.out.println("\n");
	}
	// WAP to print the table of entered no
		void table1()
		{
			System.out.println("\nEnter no to see table");
			
			int num=sc.nextInt();
			
				System.out.println();
				for(int i=1;i<=10;i++)
				{
					System.out.println();
					System.out.print(num+"*"+i+"="+(i*num));
				}
				
			
	    }
	public static void main(String[] args) 
	{
		pattern1 p=new pattern1();
		char ch;
		do
		{
		System.out.println("\n Question 1.\n Question 2.\n Question 3.\n Question 4.\n Question 5.\n Question 6.\n Question 7.\n Enter Your choice..");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:p.p1();
		break;
		case 2:p.p2();
		break;
		case 3:p.p3();
		break;
		case 4:p.p4();
		break;
		case 5:p.p5();
		break;
		case 6:p.table();
		break;
		case 7:p.table1();
		break;
		default:
			System.out.println("Please enter valid chooice");
		}
		System.out.println("Do you want to repeat");
		ch=sc.next().charAt(0);
		}
		while( ch=='Y'|| ch=='y');
	}

}
