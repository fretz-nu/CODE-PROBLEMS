
public class Triangle2D {

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
	
public Triangle2D () {
	p1 = new MyPoint(0,0);
	p2 = new MyPoint(1,1);
	p3 = new MyPoint(2,5);
}
public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
	this.p1 = p1;
	this.p2 = p2;
	this.p3 = p3;
}
public double getArea() {
	
}
	public static void main(String[] args) {
		

	}

}
