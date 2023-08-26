import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char c1 = input.next().charAt(0);
		switch(c1){
			case 'a':
				System.out.println('a');
				break;
			case 'b':
				System.out.println('b');
				break;
			default:
				break;
		}
		System.out.println("exit");
	}
}