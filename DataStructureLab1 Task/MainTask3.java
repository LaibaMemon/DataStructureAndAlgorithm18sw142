import java.util.Scanner;
class Area2
{
	double length,width;
	
	Area2(double length, double width)
	{
		this.length = length;
		this.width = width;

		System.out.print("Area = " + returnArea());
	}
	
	public double returnArea(){
		return length*width;
	}
	
	
}
class MainTask3{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Insert the length of Rectangle");
	double l = sc.nextDouble();
	System.out.println("Insert the width of Rectangle");
	double w = sc.nextDouble();

	new Area2(l,w);
	}
}