public class constructor {
	public static void main(String[] args) {
		 Person p1 = new Person();

	}
}

class Person {
	String name;
	int age;
	public Person() {
		age = 18;
	}

	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	} 
} 