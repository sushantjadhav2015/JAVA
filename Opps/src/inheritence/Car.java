package inheritence;

public class Car extends Vehicle{

	public static void main(String[] args) {
		Car obj = new Car();
		obj.printDataOfCar();
	}
	
	private void printDataOfCar() {
		this.brand = "Honda";
		this.resNum = 1515;
		this.dataOfVehicle();
	}
}
