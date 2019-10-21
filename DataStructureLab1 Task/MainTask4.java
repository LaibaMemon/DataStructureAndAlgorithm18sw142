class Account{
	protected  double balance;
	public void deposit(double amount){
		System.out.println("Hey there  you are using deposit method");
	}
	public void withDraw(double amount){
		
	    System.out.println("Hey there  you are using withdraw method");
	}
	
	
}
class SavigAccount extends Account{
	private double defaultInterestRate=2.5;
	private double interestRate;
	
	public void setDefaultInterestRate(double inrate){
		interestRate= inrate;
	}	
	public void applyInterest(){
		System.out.println("Hey there you are using applyInterest method ");
		
	}
}
class MainTask4{
	public static void main(String[] args){
		SavigAccount a=new SavigAccount();
	   a.applyInterest();
	}
}