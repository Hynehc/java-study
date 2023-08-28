public class varPara {
	public static void main(String[] args) {
		Method m = new Method();
	}
}

class Method {
	public int sum(int... nums) {
		System.out.println(nums.length);
		int sum = 0;
		for (int i = 0; i < nums.length; i ++ )
			sum += i;
		return sum;
	}
}