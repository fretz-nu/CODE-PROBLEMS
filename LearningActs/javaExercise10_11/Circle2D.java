import java.util.Scanner;
public class Circle2D{
	 
		double x, y, radius;
	
	 Circle2D (){
		 x = 0;
		 y = 0;
		 radius = 0;
	 }
	 Circle2D(double x, double y, double radius){
		 this.x = x;
		 this.y = y;
		 this.radius = radius;
	 }
	 double getArea() {
		 return Math.PI * (radius * radius);
	 }
	 double getPerimeter() {
		 return 2 * Math.PI * radius;
	 }
	 public boolean contains(double x, double y) {
		 double spoint = (((this.x - x)*(this.x - x) + (this.y - y)*(this.y-y)));
		 return spoint <= this.radius *this.radius;
	 }
	 public boolean contains(Circle2D circle) {
		double distSqrt = Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y-y));
			return this.radius > distSqrt + (this.radius * this.radius);
		}
	 public boolean overlaps(Circle2D circle) {
		 double distanceSqrt = Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y-y));
		
		 return distanceSqrt < this.radius + getRadius();
	 }
	 double getRadius() {
		 return radius;
	 }
	 public static void main(String[] args) {
	        Circle2D c1 = new Circle2D(2, 2, 5.5);
	        System.out.println("Circle2D c1 = new Circle2D(2, 2, 5.5):");
	        
	        
	        String area = String.format("%.4f", c1.getArea());
	        System.out.println("Circle2D c1's area = " + area);

	        String p = String.format("%.4f", c1.getPerimeter());
	        System.out.println("perimeter = " + p);

	        System.out.println("Result of c1.contains(3,3) = " + c1.contains(3, 3));
	        System.out.println("Result of c1.contains(new Circle2D(4,5,10.5)) = " + c1.contains(new Circle2D(4, 5, 10.5)));
	        System.out.println("Result of c1.overlaps(new Circle2D(3,5,2.3)) = " + c1.overlaps(new Circle2D(3, 5, 2.3)));
	    }
}