package dxc;

import java.util.Scanner;

class library
{
	int acc_no;
	String title;
	String author;
	int days,fine;
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Accession_no:");
		acc_no=s.nextInt();
		System.out.println("Enter Title :");
		title=s.next();
		System.out.println("Enter Author :");
		author=s.next();
		System.out.println("Enter no of day late to return :");
		days=s.nextInt();
		
		}
	void compute()
	{
		fine=days*2;
	}
	void display()
	{
		System.out.println("Accession_No \tTitle\tAuthor\tFine_Amount");
		System.out.println(acc_no+"\t\t"+title+"\t"+author+"\t"+fine);
	
	}
}

public class librarybook {

	public static void main(String[] args) 
	{
	library lib=new library();
	lib.input();
	lib.compute();
	lib.display();

	}

}
