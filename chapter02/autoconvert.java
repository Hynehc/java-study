public class autoconvert{
	public static void main(String[] args) {
		int a = 'c';
		double b = 20;
		System.out.println(a);
		System.out.println(b);

		int n1 = 10;
		float d1 = n1 + 1.1F;
		System.out.println(n1);
		System.out.println(d1);

		// int n2 = (int)2.2;
		
		// (byte, short) 和 char 之間不会互相转化
		byte b1 = 10;
		int n2 = 1;
		int n3 = b1 + n2;

	}
}
