package Chap10;

public class JavaExercise10_12 {
	static class MyPoint {
		double x, y;

		public MyPoint() {
			this(0, 0);
		}

		public MyPoint(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}

		public double distance(MyPoint point) {
			return distance(point.getX(), point.getY());
		}

		public double distance(double x, double y) {
			return Math.sqrt(Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2));
		}
	}

	static class Triangle2D {

		MyPoint p1, p2, p3;

		public MyPoint getp1() {
			return p1;
		}

		public MyPoint getp2() {
			return p2;
		}

		public MyPoint getp3() {
			return p3;
		}

		public Triangle2D() {
			p1 = new MyPoint(0, 0);
			p2 = new MyPoint(1, 1);
			p3 = new MyPoint(2, 5);
		}

		public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
			this.p1 = p1;
			this.p2 = p2;
			this.p3 = p3;
		}

		public double getArea() {
			double d1 = p1.distance(p2);
			double d2 = p2.distance(p3);
			double d3 = p3.distance(p1);
			double sp = (d1 + d2 + d3) / 2;

			return Math.sqrt(sp * (sp - d1) * (sp - d2) * (sp - d3));
		}

		double getPerimeter() {
			return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
		}

		boolean contains(MyPoint p) {
			double areaOG = new Triangle2D(p1, p2, p3).getArea();
			double area1 = new Triangle2D(p, p2, p3).getArea();
			double area2 = new Triangle2D(p1, p, p3).getArea();
			double area3 = new Triangle2D(p1, p2, p).getArea();

			return (areaOG == area1 + area2 + area3);

		}

		boolean contains(Triangle2D t) {
			if (contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3())) {
				return true;
			}
			return false;

		}

		public boolean overlaps(Triangle2D t) {
			return this.contains(t.getP1()) || this.contains(t.getP2()) || this.contains(t.getP3());
		}

		public MyPoint getP1() {
			return p1;
		}

		public void setP1(MyPoint p1) {
			this.p1 = p1;
		}

		public MyPoint getP2() {
			return p2;
		}

		public void setP2(MyPoint p2) {
			this.p2 = p2;
		}

		public MyPoint getP3() {
			return p3;
		}

		public void setP3(MyPoint p3) {
			this.p3 = p3;
		}

		public static void main(String[] args) {

			Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
			System.out.println("Triangle2D t1(2.5, 2), (4.2, 3), (5, 3.5) results:\n");

			System.out.println("Area: " + t1.getArea() + "\nPerimeter: " + t1.getPerimeter());

			System.out.println("\nt1.contains(3, 3):\n 	Is the specified point inside the triangle? --> "
					+ t1.contains(new MyPoint(3, 3)));

			System.out.println(
					"t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))):\n 	Is the specified triangle inside the triangle? --> "
							+ t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
			System.out.println(
					"t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), MyPoint(2, 6.5))):\n 	Does the specified triangle overlaps with this triangle? --> "
							+ t1.overlaps(
									new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));

		}
	}
}
