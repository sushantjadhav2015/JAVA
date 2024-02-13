package encapsulations;

import java.util.Scanner;

public class TestAge {

	public static void main(String[] args) {
		VoatingAge obj = new VoatingAge();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Wlecome to age Eiligiblity module");
		int user_age = sc.nextInt();
		obj.setAge(user_age);
		obj.checkEligibiltyOfAge();
	}
}
