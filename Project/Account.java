import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;

class Account
{
    Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");

	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
     

     Queue data1 = new LinkedList();

	//Here we Set the Customer Number

	public int setCustomerNumber(int customerNumber)
	{
		this.customerNumber=customerNumber;
		return customerNumber;
	}

	//Get the Customer Number

	public int getCustomerNumber()
	{
		return customerNumber;
	}

	//set the Pin Number

	public int setPinNumber(int pinNumber)
	{
		this.pinNumber=pinNumber;
		return pinNumber;
	}

	//get the pin Number

	public int getPinNumber()
	{
		return pinNumber;
	}

	//get Checking the Account Balance 

	public double getCheckingBalance()
	{
		return checkingBalance;
	}

	//get Saving Account Balance

	public double getSavingBalance()
	{
		return savingBalance;
	}

	//Calculate checking Account with Withdraw

	public double calCheckingWithdraw(double amount)
	{
		checkingBalance=(checkingBalance-amount);
		data1.add("Withdrawal of checkingBalance"+checkingBalance);
		return checkingBalance;
	}

	//Calculate saving Account with Withdraw

	public double calSavingWithdraw(double amount)
	{
		savingBalance=(savingBalance-amount);
		data1.add("Saving of withdraw"+savingBalance);
		return savingBalance;
	}

	//Calculate checking Account Deposite

	public double calCheckingDeposite(double amount)
	{
		checkingBalance=(checkingBalance+amount);
		data1.add("Deposite of checkingBalance"+checkingBalance);
		return checkingBalance;
	}

	//Calculate Saving Account with Deposite

	public double calSavingDeposite(double amount)
	{
		savingBalance=(savingBalance+amount);
		data1.add("saving Deposite of"+savingBalance);
		return savingBalance;
	}

	//Customer Checking Account withdraw Input

	public void getCheckingWithdrawInput()
	{
		System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
		System.out.println("Amount u want to withdraw from Checking Account :");
		double amount=menuInput.nextDouble();

		if((checkingBalance-amount) >= 0)
		{
			calCheckingWithdraw(amount);
			System.out.println("New checking Account Balance "+moneyFormat.format(checkingBalance));	
		}
		else 
		{
			System.out.println("Balance Cannot be negative::"+"\n");
		}
	}

	//Customer Saving Account withdraw Input

	public void getSavingWithdrawInput()
	{
		System.out.println("Saving Account Balance "+moneyFormat.format(savingBalance));
		System.out.println("Amount u want to withdraw from Saving Account");
		double amount=menuInput.nextDouble();

		if((savingBalance-amount) >=0)
		{
			calSavingWithdraw(amount);
			System.out.println("New Saving Account Balance "+savingBalance +"\n");
		}
		else
		{
			System.out.println("Balance Cannot be Negative ."+"\n");
		}
	}

	//Customer Checking Acount Deposite Input

	public void getCheckingDepositeInput()
	{
		System.out.println("Checking Account Balanace"+moneyFormat.format(checkingBalance));
		System.out.println("Amount u want to deposte from checking Account");
		double amount=menuInput.nextDouble();

		if((checkingBalance+amount) >=0)
		{
			calCheckingDeposite(amount);
			System.out.println("New Checking Amount Balance :"+moneyFormat.format(checkingBalance));
		}
		else
		{
			System.out.println("Balancr Cannot be Negaive "+"\n");
		}
	}

	//Customer Saving Account Deposite Input

	public void getSavingDepositeInput()
	{
		System.out.println("Saving Account Balance "+moneyFormat.format(savingBalance));
		System.out.println("Amount u want to deposite from saving Account");
		double amount=menuInput.nextDouble();

		if((savingBalance+amount)>=0)
		{
			calSavingDeposite(amount);
			System.out.println("New Saving account Balance :"+moneyFormat.format(savingBalance));
		}
		else
		{
			System.out.println("Balance Cannot be Negative:"+"\n");
		}
	}

	//private int customerNumber;
	//private int pinNumber;
	//private double checkingBalance=0;
	//private double savingBalance=0;

}