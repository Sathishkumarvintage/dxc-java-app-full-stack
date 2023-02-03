package dxc;

import java.util.Scanner;

public class method3 {
static void amg(int num)
{
	int a;int r;int s=0;
	a=num;
	while(a!=0)
	{
		r=a%10;
		s+=Math.pow(r, 3);
		a/=10;
	}
	if(s==num)
	{
		System.out.println("number is armstrong");
	}
	else
	{
		System.out.println("number is armstrong");
	}
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=s.nextInt();
		amg(num);
	}

}
