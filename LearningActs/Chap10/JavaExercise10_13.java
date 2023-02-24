package Chap10;

public class JavaExercise10_13 {
	static class MyRectangle2D {
		private double x, y, height, width;

		public MyRectangle2D() {
			x = 0;
			y = 0;
			height = 1;
			width = 1;
		}

		public MyRectangle2D(double x, double y, double height, double width) {
			this.x = x;
			this.y = y;
			this.height = height;
			this.width = width;
		}

		public double getX() {
			return x;
		}

		public MyRectangle2D setX(double x) {
			this.x = x;
			return this;
		}

		public double getY() {
			return y;
		}

		public MyRectangle2D setY(double y) {
			this.y = y;
			return this;
		}

		public double getHeight() {
			return height;
		}

		public MyRectangle2D setHeight(double height) {
			this.height = height;
			return this;
		}

		public double getWidth() {
			return width;
		}

		public MyRectangle2D setWidth(double width) {
			this.width = width;
			return this;
		}

		public double getArea() {
			return height * width;
		}

		public double getPerimeter() {
			return (2 * (height + width));
		}

		public boolean contains(double x, double y) {

			if (x >= this.x && x <= this.x + this.width && y >= this.y && y <= this.y + this.height) {
				return true;
			}
			return false;

		}

		public boolean contains(MyRectangle2D r) {

			double rX = r.getX();
			double rY = r.getY();
			double rWidth = r.getWidth();
			double rHeight = r.getHeight();

			if (rX >= this.x && rY >= this.y && rX + rWidth <= this.x + this.width
					&& rY + rHeight <= this.y + this.height) {
				return true;
			} else if (r.getArea() > this.getArea()) {

			}
			return false;

		}

		public boolean overlaps(MyRectangle2D r) {
			double rX = getX();
			double rY = getY();
			double rWidth = getWidth();
			double rHeight = getHeight();

			if (this.x + this.width < rX || rX + rWidth < this.x || this.y + this.height < rY
					|| rY + rHeight < this.y) {
				return false;
			}
			return true;
		}

		public static void main(String[] args) {

			MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
			System.out.println("MyRectangle2D r1 (new MyRectangle2D(2, 2, 5.5, 4.9) results:\n");
			System.out.println("Area: " + r1.getArea() + "\nPerimeter: " + r1.getPerimeter());

			System.out.println("\nr1.contains(3, 3):\n 	Is the specified point inside the rectangle? --> "
					+ (r1.contains(3, 3)));

			System.out.println(
					"r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)):\n 	Is the specified rectangle inside the rectangle? --> "
							+ r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
			System.out.println(
					"r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)):\n 	Does the specified rectangle overlaps with this rectangle? --> "
							+ r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));

		}
	}
}
