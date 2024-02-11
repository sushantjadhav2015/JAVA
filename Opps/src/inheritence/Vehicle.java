package inheritence;

public class Vehicle {
		String brand = null;
		int resNum = 123456;
		String engineCapa = "";
		String color = "any color";
		
		
		public void dataOfVehicle() {
			System.out.println("Brand of vehicle is : "+brand);
			System.out.println("Engine CC is : "+engineCapa);
			System.out.println("Register Number : "+resNum);
		}
}
