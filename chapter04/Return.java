public class Continue {
	public static void main(String[] args) {
		a1:
		for (int i = 0; i < 4; i ++ ) {
			b1:
			for (int j = 0; j < 10; j ++ ) {
				if (i == 2) return;
				System.out.println(i);
			}
		}
	}
}