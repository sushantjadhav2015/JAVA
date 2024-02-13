package encapsulations;

public class VoatingAge {

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			this.age = 0;
			System.out.println("Enter valid age "+age);
		}
	}

	private int age;
	
	void checkEligibiltyOfAge() {
		if (age>=18) {
			System.out.println("Congratulation you are eligible for voating "+age);
		} else {
			System.out.println("Sorry you are not eligible "+age);
		}
	}

}
