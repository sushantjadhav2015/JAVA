public class Basic {
	
	public static void main(String[] args) {
		
		System.out.println("Inside Main method");
		
		try {
			
			int a = 10;
			int b = 5;
			
			//DB Connection open
			
			int res = a/b;

			System.out.println(res);
			
			int[] arr = new int[1];
			
			System.out.println(arr[0]);
			
			String name = null;
			
			try {
				System.out.println(name.charAt(1));
			}catch(Exception e1) {
				System.out.println("Inside catch block");
			}
			
			
		} catch (ArithmeticException ae) {
			
			System.out.println("Arithmentic Exception occured");
		} catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("ArrayIndexOutOfBoundsException occured");
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Inside Finally block");
			//DB Connection close
		}
		
		
		Basic obj = new Basic();
		obj.m1();
	}
	
	void m1() {
		
		System.out.println("Inside Basic-m1");
		m2();
	}
	
	void m2() {
		System.out.println("Inside Basic-m2");
		//m1();
	}

}
