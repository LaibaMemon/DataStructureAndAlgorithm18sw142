import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;



class OptionMenu extends Account
{
	Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");

	HashMap<Integer, Integer> data=new HashMap<Integer, Integer>();
	

	

	//validate Login information of customer number and pin number

	public void getLogin() throws IOException
	{
		int x=1;


               System.out.println("\n\n\n\t\t\t\t\t\t *******************************************\n");
               System.out.print("\t\t\t\t\t\t\t WELCOME TO THE ATM PROJECT" );
	 	       System.out.println("\n\n\n\t\t\t\t\t\t *******************************************\n");
               //System.out.println("Welcome to the ATM Project");


		do
		{
			try
			{
               data.put(1233456,3333);
               data.put(1111111,6666);
               
               

               System.out.println("Enter the Customer number=");
               setCustomerNumber(menuInput.nextInt());

               System.out.println("Enter the Customer Pin Number=");
               setPinNumber(menuInput.nextInt());
			}
			catch(Exception e)
			{
				 System.out.println("\n" + "Invalid Character(s).Only numbers" + "\n");
				  x=2;
			}

			for(Map.Entry<Integer,Integer> entry : data.entrySet())
			{
				if(entry.getKey()==getCustomerNumber()  && entry.getValue()==getPinNumber())
					getAccountType();
				else{
						System.out.println("\n" + "Wrong Customer Number Or Pin Number " + "\n");
					
					}
				}
			
		}
		while(x==1);
	}
	

		//Display the Account Type Menu with Selection 

		public void getAccountType()
		{
			int Selection;
			System.out.println("Select the Account you want to Access");
			System.out.println("Type 1-- Checking Account");
			System.out.println("Type 2-- Saving Account");
			System.out.println("Type 3--Transaction of Money");
			System.out.println("Type 4-- Deposite Account");
			System.out.println("Type 5 --Exit");
			System.out.println("Choice--");

			Selection=menuInput.nextInt();

			switch(Selection)
			{
				case 1:
				getChecking();
				break;

				case 2:
				getSaving();
				break;

				case 3:
				getTransaction();
				break;

                case 4:
                System.out.println("Thankyou for using the ATM, bye--");
                break; 

				default:
				System.out.println("\n" + "Invalid Choice---" +"\n");
				getAccountType();				
			}
		}

		public void getChecking()
		{
			int Selection;
			System.out.println("Checking Account:");
			System.out.println("Type 1: View Balance");
			System.out.println("Type 2: Withdraw Funds");
			System.out.println("Type 3: Deposite Funds");
			System.out.println("Type 4--Transaction of Money");
			System.out.println("Type 5:  Exit");
			System.out.println("Choice: ");

			Selection=menuInput.nextInt();

			switch(Selection)
			{
				case 1:
				System.out.println("Chceking Account Balance "+ moneyFormat.format(getCheckingBalance()));
				getAccountType();
				break;

				case 2:
				getCheckingWithdrawInput();
				getAccountType();
				break;

				case 3:
				getCheckingDepositeInput();
					getAccountType();
				break;

				case 4:
				System.out.println("Thankyou for Using this ATM ,Bye--");
				break;

				default:
				System.out.println("\n" +"Invalid Choice-"+ "\n");
				getChecking();

			}
		}

		public void getSaving()
		{
            System.out.println("Saving Account:");
			System.out.println("Type 1: View Balance");
			System.out.println("Type 2: Withdraw Funds");
			System.out.println("Type 3: Deposite Funds");
			System.out.println("Type 4--Transaction of Money");
			System.out.println("Type 5:  Exit");
			System.out.println("Choice: ");

			int Selection=menuInput.nextInt();

			switch(Selection)
			{
				case 1:
				System.out.println("Saving Account Balance :"+moneyFormat.format(getSavingBalance()));
				getAccountType();
				break;

				case 2:
				getSavingWithdrawInput();
				getAccountType();
				break;

				case 3:
				getSavingDepositeInput();
				getAccountType();
				break;

				case 4:
				System.out.println("Thankyou for Using the ATM ,Bye-");
				break;

				default:
				System.out.println("\n" +"Invalid Choice" +"\n");
				getSaving();

			}

		}
		public void getTransaction()
		{ 
			for(Object object : data1) {
			    String element = (String) object;
			    System.out.println(element);
			}


		}
		
	
}