public class ReationalOperator {
	public static void main(String[] args) {
		int a = 9;
		int b = 8;
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a < b);
		System.out.println(a != b);
	}
}
class LogicOperator{
	public static void main(String[] args) {
		int a = 20;
		if (a >= 1 && a < 30) 
			System.out.println("yes");
	}
}
class AssingOperator{
	public static void main(String[] args) {
		int a = 10;
		a += 20;
		a *= 23;
		System.out.println(a);
	}
}
class Ternary{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a > b ? a ++ : b ++ ;
		System.out.println(a + " " + b);
	}
}