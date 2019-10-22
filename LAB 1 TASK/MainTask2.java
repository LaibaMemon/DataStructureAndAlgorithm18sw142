import java.util.Scanner;
class Area
{ 
	//instance Variable 
	double length,width;
	 

	 //set the length and Width of Rectangle 
	public void setDim(double length, double width){
		this.length = length;
		this.width = width;
	}
	

	//here we return Area of Triangle
	public double getArea(){
		return length*width;
	}

	
}
class MainTask2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Insert the length of Rectangle");
	double l = sc.nextDouble();
	System.out.println("Insert the width of Rectangle");
	 double w = sc.nextDouble();

	Area area = new Area();
	area.setDim(l,w);
	System.out.println("Area = " + area.getArea() );

	}
}