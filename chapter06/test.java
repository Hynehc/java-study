public class test {
	public static void main(String[] args) {
		
	}
}

class A01 {
	public double max(double[] arr) {
		double max = arr[0];
		for (int i = 0; i < arr.length; i ++ ) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}

class A02 {
	public int find(String findStr, String[] strs) {
		for (int i = 0; i < strs.length; i ++ ) {
			if (findStr.equals(str[i])) {
				return i;
			}
		}
		return -1;
	}
}

class Book {
	String name;
	double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void updata() {
		if (this.price > 150) {
			this.price = 150;
		}
		else if (this.price > 100) {
			this.price = 100;
		}
	}

	public void info() {
		System.out.println(this.name + " " + this.price);
	}
}

class A03 {
	public int[] copyArr(int[] oldArr) {
		int[] newArr = new int[oldArr.length];
		for (int i = 0; i < oldArr.length; i ++ ) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}

class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
	
	public double len() {
		return 2 * Math.PI * radius;
	}
}