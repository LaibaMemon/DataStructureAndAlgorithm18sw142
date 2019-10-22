//the Class Diagram through the UML 

class Account
{
	//instance Variable 
	protected  double balance;

	//Deposite Method
	public void deposit(double amount){
		//here we dont need to require the implementation
	}
	//Withdarw Method
	public void withDraw(double amount){
		
	    //here we dont need to require the implementation
	}
	
	
}
class SavigAccount extends Account
{
	//instance Variable 
	private double defaultInterestRate=2.5;
	private double interestRate;
	
	public void setDefaultInterestRate(double inrate){
		interestRate= inrate;
	}	
	public void applyInterest(){
		//here we dont need to require the implementation
		
	}
}
class MainTask4{
	public static void main(String[] args){
		SavigAccount a=new SavigAccount();
	   a.applyInterest();
	}
}