package Chap10;

public class JavaExercise10_11 {
	static class Circle2D {

		double x, y, radius;

		Circle2D() {
			x = 0;
			y = 0;
			radius = 1;
		}

		Circle2D(double x, double y, double radius) {
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
			double spoint = (((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)));
			return spoint <= this.radius * this.radius;
		}

		public boolean contains(Circle2D circle) {

			return Math.abs(this.radius - circle.radius) > distSqrt(circle.x, circle.y);
		}

		double distSqrt(double x2, double y2) {

			return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
		}

		public boolean overlaps(Circle2D circle) {
			double distanceSqrt = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));

			return distanceSqrt < this.radius + getRadius();
		}

		double getRadius() {
			return radius;
		}

		double getX() {
			return x;
		}

		double getY() {
			return y;
		}

		public static void main(String[] args) {
			Circle2D c1 = new Circle2D(2, 2, 5.5);
			System.out.println("Circle2D c1(2, 2, 5.5) results:\n");
			System.out.println("Area: " + c1.getArea() + "\nPerimeter: " + c1.getPerimeter());

			System.out.println(
					"\nc1.contains(3, 3):\n 	Is the specified point inside the circle? --> " + c1.contains(3, 3));
			System.out
					.println("c1.contains(new Circle2D(4, 5, 10.5)):\n 	Is the specified circle inside the circle? --> "
							+ c1.contains(new Circle2D(4, 5, 10.5)));
			System.out.println(
					"c1.overlaps(new Circle2D(3, 5, 2.3))):\n 	Does the specified circle overlaps with this circle? --> "
							+ c1.overlaps(new Circle2D(3, 5, 2.3)));
		}
	}
}