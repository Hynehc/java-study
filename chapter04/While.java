public class While {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			if (i % 9 == 0)
				System.out.println(i);
			i ++ ;
		}
	}
}