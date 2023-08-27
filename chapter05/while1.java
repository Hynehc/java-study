import java.util.Scanner;
public class while1 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i ++ ;
		}
		System.out.println("exit");
	}
}

class DoWhile1 {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			i ++ ;
		} while (i <= 10);
	}
}

class DoWhile2 { 
	public static void main(String[] args) {
		int  i = 1;
		int cnt = 0;
		do {
			if (i % 5 == 0 && i % 3 != 0) {
				cnt ++ ;
			}
			i ++ ;
		} while (i <= 200);
		System.out.println(cnt);
	}
}

class DoWhile3 {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		char answer = ' ';
		do {
			answer = myscanner.next().chatAt(0);
		} while (answer != 'y');
	}
}