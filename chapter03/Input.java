import java.util.Scanner;
public class Input{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("name:");
		String name = myscanner.next();
		System.out.println("age:");
		int age = myscanner.nextInt();
		System.out.println("salary:");
		double salary = myscanner.nextDouble();
		System.out.println(name + " " + age + " " + salary);
	}
}