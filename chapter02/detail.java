public class detail{
	public static void main(String[] args){
		int n1 = 1;
		long n2 = 1L;
		System.out.println(n1);
		System.out.println(n2);
	}
}
class detail1{
	public static void main(String[] args) {
		float n1 = 1.1f;
		System.out.println(n1);
		double n2 = 1.1;
		System.out.println(n2);
		double n3 = 1.1f;
		System.out.println(n3);

		double n4 = .512;
		System.out.println(n4);
		System.out.println(5.12e2);
		System.out.println(5.12e-2);

		double x1 = 2.7;
		double x2 = 8.1 / 3;
		if (Math.abs(x1 - x2) < 12e-2)
			System.out.println(Math.abs(x1 - x2));
	}
}