public class This {
	public static void main(String[] args) {
		// Dog d1 = new Dog("da", 3);
		// d1.info();
	}
}

class Dog {
	String name;
	int age;
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void info() {
		System.out.println(name + age);
	}
}

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person p) {
		if (this.name.equals(p.name) && this.age == p.age) {
			return true;
		}
		else {
			return false;
		}
	}
}