/* WAP to accept array from user and display smallest no, greatest no from array
  also display array in ascending and descending order
 */
package abc;
import java.util.Scanner;
public class mult_funct_array 
{

	
	void smallest(int n1[],int size) // used parameterized function
	{
		int temp,i,j;
		for (i = 0; i < size; i++) 
		  {     
	        for (j=i+1;j < size; j++)// used nested for loop to get array in ascending order
	        {     
	           if(n1[i] > n1[j]) //it compare each n every element from array
	           {    
	               temp = n1[i];    
	               n1[i] = n1[j];    
	               n1[j] = temp;    
	           }     
	        } 
		  }    
	         
	              
	         System.out.println("\nSmallest no in array is "+n1[0]);  // get smallest no from 0 index of array
	            
	}
	void greatest(int n1[],int size)
	{
		int temp,i,j;
		for (i = 0; i < size; i++) 
		  {     
	        for (j=i+1;j < size; j++)
	        {     
	           if(n1[i] > n1[j]) 
	           {    
	               temp = n1[i];    
	               n1[i] = n1[j];    
	               n1[j] = temp;    
	           }     
	        } 
		  }    
	         
	              
	         System.out.println("\nGreatest no in array is "+n1[size-1]);   // get greatest no from last index of array
	            
	            
	}
	void ascending(int n1[],int size)
	{
		
		int temp,i,j;
		System.out.println("\nArray in ascending order...");
		 for (i = 0; i < size; i++) 
		  {     
	        for (j=i+1;j < size; j++)
	        {     
	           if(n1[i] > n1[j]) 
	           {    
	               temp = n1[i];    
	               n1[i] = n1[j];    
	               n1[j] = temp;    
	           }     
	        } 
		  }    
	         
	         for ( i = 0; i < size; i++) 
	         {     
	         System.out.println(" "+n1[i]);  //find array in ascending order
	         }    
	}
	void descending(int n1[],int size)
	{
	
		int i,temp,j;
		 for (i = 0; i < size; i++) 
		  {     
	        for (j=i+1;j < size; j++)
	        {     
	           if(n1[i] > n1[j]) 
	           {    
	               temp = n1[i];    
	               n1[i] = n1[j];    
	               n1[j] = temp;    
	           }     
	        } 
		  } 
		System.out.println("Array in descending order...");//find array in descending order
		for(i=size-1;i>=0;i--)
		{
			System.out.println(n1[i]);
		}
	}
	
	public static void main(String[] args)
	{
		mult_funct_array mfa=new mult_funct_array();
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("Enter the size");
		size=sc.nextInt();
		int num[]=new int[size];
		System.out.println("Enter "+size+" Numbers:");// enter array from user
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		mfa.smallest(num, size);//Function call
		mfa.greatest(num, size);
		mfa.ascending(num, size);
		mfa.descending(num, size);
	}

}
