package arrays;

import java.util.Arrays;

public class ReturnSecondLargestNum {

	public static void main(String[] args) {
		int[] arr = {25,10,35,15,45};

		ReturnSecondLargestNum Obj = new ReturnSecondLargestNum();
		int num = Obj.secondLargNumber(arr);
		System.out.println("Second largest number is : "+num);
	}

	static int secondLargNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("array in ascending order :"+Arrays.toString(arr));
		return arr[1];
	}
}
