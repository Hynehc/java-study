import java.util.Scanner;
public class exercise { 
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		double cnt = 0;
		for (int j = 1; j <= 3; j ++ ) {
			for (int i = 1; i <= 5; i ++ ) {
				double score = myscanner.nextDouble();
				cnt += score;
			}
			cnt /= 5;
			System.out.println(cnt);
		}
	}
}

class break {
	public static void main(String[] args) {
		int cnt = 0;
		int x = (int)(Math.random() * 100) + 1;
		while (x != 97) {
			cnt ++ ;
		}
	}
}

