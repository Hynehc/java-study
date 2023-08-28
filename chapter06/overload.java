public class overload {
	public static void main(String[] args) {
		MyCalculate mc = new MyCalculate();
		System.out.println(mc.calculate(1, 2, 3));
	}
}

class MyCalculate {
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}
	public double calculate(int n1, double n2) {
		return n1 + n2;
	}
	public int calculate(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
}