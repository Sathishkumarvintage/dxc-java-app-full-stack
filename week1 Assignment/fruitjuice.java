package dxc;

import java.util.Scanner;

class fruit
{
	int codeno;
	String flavour;
	String packtype;
	int packsize;
	int productprice;
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter code :");
		codeno=s.nextInt();
		System.out.println("Enter Flavour :");
		flavour=s.next();
		System.out.println("Enter Pack_type :");
		packtype=s.next();
		System.out.println("Enter Pack_size :");
		packsize=s.nextInt();
		System.out.println("Enter Product_prize :");
		productprice=s.nextInt();
	}
	void discount()
	{
		productprice=productprice-10;
	}
	void display()
	{
		System.out.println("Code :"+codeno);
		System.out.println("Flavour :"+flavour);
		System.out.println("Pack_type :"+packtype);
		System.out.println("Pack_size :"+packsize);
		System.out.println("Product_prize :"+productprice);
	}
	
}
public class fruitjuice {

	public static void main(String[] args)
	{
		fruit f=new fruit();
		f.input();
		f.discount();
		f.display();

	}

}
