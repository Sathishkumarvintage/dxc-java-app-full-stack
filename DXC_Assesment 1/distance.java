package Methodoverloading;

public class distance {

	public static void main(String[] args) 
	{
		point origin=new point(0,0);
		point p1=new point(2,3);
		point p2=new point(5,6);
		double distance=origin.getDistance(p1);
		double distance1=p1.getDistance(p2);
		System.out.println("The Distance P1 from the Origin :"+distance);
		System.out.println("The Distance P1 from P2 :"+distance1);

	}

}
