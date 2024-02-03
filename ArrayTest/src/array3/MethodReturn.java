package array3;

public class MethodReturn {
	
	public static void main(String[] args) {
		
		MethodReturn obj = new MethodReturn();
		int result = obj.addition(10, 20);
		
		System.out.println("Addition result is-"+result);
	}

	int addition(int val1, int val2) {
		
		int res = val1 + val2;
		
		return res;
	}
}
