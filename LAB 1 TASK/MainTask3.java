import java.util.Scanner;
class Area2
{
	//instance Variable
	double length,width;
	 
	//Here we create the Constructor and set the values of length and breath
	Area2(double length, double width)
	{
		this.length = length;
		this.width = width;

		System.out.print("Area = " + returnArea());
	}
	//Method that return the area of Rectangle
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