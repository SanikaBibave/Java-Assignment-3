import java.util.Scanner;

public class Operation{
	public static void main(String[] args){
	int a,b;
	int op;
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter a Equation");
	a=sc.nextInt();
	op=sc.next().charAt(0);
	b=sc.nextInt();

	switch(op){
	case '+' :System.out.println(a+" " +op+" "+b+" = "+(a+b));
	          break;
	case '-' : System.out.println(a+" " +op+" "+b+" ="+(a-b));
		    break;
	case '*' : System.out.println(a+" " +op+" "+b+" ="+(a*b));
			break;		
	case '/' : System.out.println(a+" " +op+" "+b+" ="+(a/b));
			break;	

	}
    }
}
	
	
