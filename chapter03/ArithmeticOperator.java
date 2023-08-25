public class ArithmeticOperator {
	public static void main(String[] args) {
		System.out.println(10.0 / 4);
		double d = 10 / 4;
		System.out.println(d);
		int i = 10;
		i ++ ;
		++ i;
		System.out.println(i);
		int j = 8;
		int k = ++ j;
		int s = j ++ ;
		System.out.println("k = " + k + "j = " + j + "s = " + s);
	}
}
class detail{
	public static void main(String[] args) {
		int i = 1;
		i = i ++ ;
		System.out.println(i);
	}
}
class detail1{
	public static void main(String[] args) {
		int i = 1;
		i = ++ i;
		System.out.println(i);
	}
}
class detail2{
	public static void main(String[] args) {
		int x = 59;
		int w = 59 / 7;
		int d = 59 % 7;
		System.out.println(w + " " + d);	
	}
}