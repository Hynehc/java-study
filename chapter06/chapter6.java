import java.util.Scanner;
public class chapter6 {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.name = "white";
		cat1.age = 3;
		cat1.color = "w";

		Cat cat2 = new Cat();
		cat2.name = "flower";
		cat2.age = 2;
		cat2.color = "f";

		System.out.println(cat1.name + cat1.age + cat1.color);
		System.out.println(cat2.name + cat2.age + cat2.color);
	}
}

class Cat {
	String name;
	int age;
	String color;
	double weight;
}

class methon {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.speak(); 
		p1.cal01();
		p1.cal02(10000);
	}
}

class Person {
	String name;
	int age;
	public void speak() {
		System.out.println("why?");
	}

	public void cal01() {
		int res = 0;
		for (int i = 1; i <= 1000; i ++ ) {
			res += i;
		}
		System.out.println(res);
	}

	public void cal02(int n) {
		int res = 0;
		for (int i = 1; i <= n; i ++ ) {
			res += i;
		}
		System.out.println(res);
	}

	public int getSum(int x1, int x2) {
		int res = x1 + x2;
		return res;
	}
}

