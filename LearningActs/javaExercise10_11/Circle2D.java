
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
		 
return true;

	 }
	 public boolean contains(Circle2D circle) {
			return true;
		}
	 public boolean overlaps(Circle2D circle) {
		 return true;
	 }
public static void main (String []args) {
	
}
}
