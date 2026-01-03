import java.util.Scanner;
public class SwitchCircle{
	public static void main(String[] args){
	int n;
	float radius=0;

	Scanner sc=new Scanner(System.in);
	while(true){
	System.out.println("1:Area Of Circle\n2:Circumference Of Cricle\n3:Volume Of Sphere");
        System.out.println("Enter your choice:");
	System.out.println("*************************************************");
	n=sc.nextInt();
	System.out.println("Enter a Radius ");
	radius=sc.nextFloat();

	switch(n){
	case 1: 
		float area;
		area=3.14f*radius*radius;
		System.out.println("Area of circle is:"+area);
		break;

	case 2:float cir;
		cir=2*3.14f*radius;
		System.out.println("Circumference of Circle is:"+cir);
		break;

	case 3:float volume;
		volume=(4f/3f)*3.14f*radius*radius*radius;
		System.out.println("Volume of Sphere is:"+volume);
		break;
		
	case 4 :System.out.println("Exiting");
		System.exit(0);
		break;

	default :System.out.println("INvalid choice");
	}
      }
    }
}
		
	