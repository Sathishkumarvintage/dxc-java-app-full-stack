package dxc;

import java.util.Scanner;

public class Selection_control_statement {

	public static void main(String[] args) {
		double account_no,balance,salary,e_loan,emi;
		String loan_type;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your account_No : ");
	    account_no=s.nextDouble();
		if(account_no<1000 && account_no>1999 )
		{
			System.out.println("Account_No is Inavlid");
		}
		System.out.println("Enter the Account Balance of the customer : ");
	    balance=s.nextDouble();
	    if(balance<1000)
	    {
	    	System.out.println("You are not Eligible for loan");
	    }
		System.out.println("Enter the Salary of the Customer : ");
	    salary=s.nextDouble();
	    System.out.println("Enter your Loan type : ");
	    loan_type=s.next();
	    System.out.println("Enter Expected loan amount : ");
		e_loan=s.nextDouble();
		System.out.println("Enter Expected No_of EMI : ");
		emi=s.nextDouble();
		if(salary>25000 && salary<=50000)
		{
			if(loan_type.equalsIgnoreCase("car"))
			{
				if(e_loan<500000)
				{
					if(emi<36)
					{
						System.out.println("Eligible loan amount is 500000");
						System.out.println("Eligible EMI is 36");
					}
				}
			}
		}
		else if(salary>50000 && salary<=75000)
		{
			if(loan_type=="house")
			{
				if(e_loan<6000000)
				{
					if(emi<60)
					{
						System.out.println("Eligible loan amount is 6000000");
						System.out.println("Eligible EMI is 60");
					}
				}
			}
		}
		else if(salary>75000 )
		{
			if(loan_type=="business")
			{
				if(e_loan<7500000)
				{
					if(emi<84)
					{
						System.out.println("Eligible loan amount is 7500000");
						System.out.println("Eligible EMI is 84");
					}
				}
			}
		}
		else
		{
			System.out.println("Your are Not Eligible for loan");
		}


	}

}
