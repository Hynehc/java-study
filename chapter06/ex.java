import java.util.Scanner;
public class ex {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "wh";
		p.age = 10;

		MyTools mytools = new MyTools();
		Person p2 = mytools.copyPerson(p);

		System.out.println(p.name + p.age);
		System.out.println(p2.name + p2.age);

		T t1 = new T();
		int x = t1.F(8);
		System.out.println(x);
	}
}


class Person {
	String name;
	int age;
}

class MyTools {
	public Person copyPerson (Person p) {

		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}

class T {
	public int F (int n) {
		if (n >= 1) {
			if (n == 1 || n == 2) {
				return 1;
			}
			else {
				return F(n - 1) + F(n - 2);
			}
		}	
		else {
			return -1;
		}
	}

	public int slove1 (int n) {
		if (n == 10) {
			return 1;
		}
		else if (n >= 1 && n <= 9) {
			return (slove1(n + 1) * 2);
		}
		else {
			return -1;
		}
	}
}