import java.util.Scanner;
public class If{
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int age = t.nextInt();
		if (age > 18)
			System.out.println("ji");
		else if (age > 14  && age <= 18)
			System.out.println("6");
		else
			System.out.println("8484848");

	}
}
class NextedIf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double score = s.nextDouble();
		if (score > 8.0){
			System.out.println(" congratulation ");
			char gender = s.next().charAt(0);
			if (gender == 'ÄÐ')
				System.out.println("man");
			else if (gender == 'Å®')
				System.out.println("woman");
			else
				System.out.println("wrong");
		}
		else{
			System.out.println("sorry");
		}
	}
}