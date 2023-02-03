package dxc;

import java.util.Scanner;

public class animal {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int h,l,chcount=0,rcount=0;
		System.out.println("Enter the head:");
		h=s.nextInt();
		System.out.println("Enter the leg :");
		l=s.nextInt();
		if(h>=l || l%2!=0)
		{
			System.out.println("Invalid input..");
		}
		else
		{
			rcount=(l-2*h)/2;
			chcount=h-rcount;
			System.out.println("Chicken :"+chcount+" Rabbit :"+rcount);
		}
	}

}
