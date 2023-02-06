package Methodoverloading;

public class point {
	 private double x;
	 private double y;
	 public point(double x,double y)
	 {
		 this.x=x;
		 this.y=y;
	 }
	 public double getX()
	 {
		return x;
		 
	 }
	 public double getY()
	 {
		return y;
		 
	 }
	 public double getDistance(point p)
	 {
		return Math.sqrt((this.getX()-p.getX())*(this.getX()-p.getX())+(this.getY()-p.getY())*(this.getY()-p.getY()));
		 
	 }

	
}
