package dxc;

import java.util.Scanner;

class ticket
{
	private int movieid;
	private int no_ofseat;
	
	public ticket(int id,int seat)
	{
		movieid=id;
		no_ofseat=seat;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int id) {
		this.movieid = id;
	}

	public int getNo_ofseat() {
		return no_ofseat;
	}

	public void setNo_ofseat(int seat) {
		this.no_ofseat = seat;
	}
	public double getCost1()
	{
		
		return((double)no_ofseat*7);	
		
	}
	public double getCost2()
	{
		
		return((double)no_ofseat*8);	
		
	}
	public double getCost3()
	{
		
		return((double)no_ofseat*8.5);	
		
	}
	
}

public class movieticket {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int id,seat;
		System.out.println("Enter Movie_Id:");
		id=s.nextInt();
		System.out.println("Enter No_of Seat:");
		seat=s.nextInt();
		ticket t=new ticket(id,seat);
		if(id==111)
		System.out.println("Cost :"+t.getCost1());
		else if(id==112)
			System.out.println("Cost :"+t.getCost2());
		else if(id==113)
			System.out.println("Cost :"+t.getCost3());
		else
			System.out.println("Inavlid Movie Id");
	}

}
