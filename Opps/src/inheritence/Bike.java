package inheritence;

public class Bike extends Vehicle{

	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.bikeData();
	}
	
	private void bikeData() {
		this.brand = "KTM";
		this.resNum = 2838;
		this.color = "orange";
		this.engineCapa = "200 cc";
		this.dataOfVehicle();
		System.out.println("Bike color : "+this.color);
	}
}