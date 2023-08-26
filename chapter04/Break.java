public class Break {
	public static void main(String[] args) {
		for (int i = 0;i <= 10; i ++ )
				System.out.println((int)(Math.random() * 100));
	}
}

class Detail1 {
	public static void main(String[] args) {
		lable1:
		for (int i = 0; i <4; i ++ ) {
			lable2:
			for (int j = 0; j < 10; j ++ )
				if (j == 2) break;
			System.out.println(i);
		}
	}
}