import java.util.Scanner;
public class Operation2{
	public static void main(String[] args){
	int x=0,y=0;
	int ch;
	Scanner sc=new Scanner(System.in);
	while(true){
	    System.out.println("1:Equality\n 2:Less Than \n 3:Quotient and Reminder\n 4:Range\n 5:Swap\n 6: Exit...");
	    System.out.println("Enter your choice");
	    ch=sc.nextInt();
	     System.out.println("--------------------------------------------------------");	
	    System.out.println("Enter 2 Number");
	    x=sc.nextInt();
	    y=sc.nextInt();
	   
	
	switch(ch){
		case 1:
			if(x==y)
				System.out.println("Equal");
			else
				System.out.println("Not Equal");
			 System.out.println("*********************************************");
			break;
		case 2: 
			if(x>y)
				System.out.println("X is Greater than Y");
			else
				System.out.println("Y is Greater than X");
			 System.out.println("********************************************");
			break;
		case 3:
			int rem=x%y;
			int quo=x/y;
			System.out.println("Quotient is: "+quo);
			System.out.println("Reminder is: "+rem);
			 System.out.println("*********************************************");
			break;
		case 4: System.out.println("Enter a Number");
			int a=sc.nextInt();
			if(a>=x && a<=y)
				System.out.println("Range:between X and Y");

			else 
				System.out.println("Not in Range");
			 System.out.println("*********************************************");
			break;
		case 5:
			System.out.println("Before Swapping");
			System.out.println("x=" +x);
			System.out.println("y="+y);
			System.out.println("After Swapping");
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println("x="+x);
			System.out.println("y="+y);
			 System.out.println("***************************************************");
			break;
		case 6: System.out.println("Exit");
			System.exit(0);
			break;
			
		default: System.out.println("Invalid choice");
		}
	    }
	}
}
			

		

	
	

	