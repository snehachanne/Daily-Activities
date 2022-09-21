import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Do_while_demo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int menu_item, menu1;
        int total=0;  
		char ans;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Menu:\n1:Starters \n2:Main course \n3:Deserts");
			menu_item=sc.nextInt();
			switch(menu_item)
			{
			case 1:
				System.out.println("1:Veg Manchurian\t\t 160Rs.");
				System.out.println("2:Paneer Tikka   \t\t 190Rs.");
				System.out.println("3:Veg Crispy     \t\t 170Rs.");
                System.out.println("Order your fav starter");
				menu1=sc.nextInt();
                if(menu1==1)
                {
                total=total+160;
                }
                else if(menu1==2)
                {
                total=total+190;
                }
                else if(total==3)
                {
                total=total+170;
                }
                else
                System.out.println("Sorry this item is not available");
                break;
			case 2:
				System.out.println("1:Kaju Masala   \t\t 300Rs.");
				System.out.println("2:Cheeze Anguri \t\t 350Rs.");
				System.out.println("3:Malai Kofta   \t\t 250Rs.");
                System.out.println("Order your fav Item");
				menu1=sc.nextInt();
                if(menu1==1)
                {
                total=total+300;
                }
                else if(menu1==2)
                {
                total=total+350;
                }
                else if(total==3)
                {
                total=total+250;
                }
                else
                {
                System.out.println("Sorry this item is not available");
                }
                break;
				
			case 3:
				System.out.println("1:Icecream    \t\t 120Rs.");
				System.out.println("2:Gulab Jamun \t\t 150Rs.");
				System.out.println("3:Cake        \t\t 160Rs.");
                System.out.println("Order your fav Desseret");
				menu1=sc.nextInt();
                if(menu1==1)
                {
                total=total+120;
                }
                else if(menu1==2)
                {
                total=total+150;
                }
                else if(total==3)
                {
                total=total+160;
                }
                else
                {
                System.out.println("Sorry this item is not available");
                }
                break;
                default:
                System.out.println("Please enter valid choice..");
                break;

			    
			}
            
			System.out.println("Do you want to add another item y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
        System.out.println("Total=" +total);
		System.out.println("Thanks for coming");

	}

}