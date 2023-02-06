package dxc;

import java.util.Scanner;

public class DXCcrickettournment {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String[] cart= {"round-neck","collared","hooded","round-neck","round-neck"};
		int totcost=0,discount=0;
		double finalamount=0;
		for(String dress:cart)
		{
			if(dress.equalsIgnoreCase("round-neck"))
			{
				totcost+=200;
			}
			else if(dress.equalsIgnoreCase("collared"))
			{
				totcost+=250;
			}
			else if(dress.equalsIgnoreCase("hooded"))
			{
				totcost+=300;
			}
		}
		if(cart.length<5)
		{
			discount=0;
		}
		else if(cart.length>=5 && cart.length<=10)
		{
			discount=10;
		}
		else if(cart.length>10)
		{
			discount=20;
		}
		discount=totcost*discount/100;
		finalamount=(totcost-discount);
		System.out.print("Cart :");
		for(String dress:cart)
		{
			System.out.print(dress+", ");
		}
		System.out.println();
		System.out.println("Final price is : Rs."+finalamount);

	}

}
