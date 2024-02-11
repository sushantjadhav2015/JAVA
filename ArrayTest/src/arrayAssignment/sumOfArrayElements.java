package arrayAssignment;

import java.util.Arrays;

public class sumOfArrayElements {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		
		sumOfArrayElements obj = new sumOfArrayElements();
		obj.sumOfEvenAndOddNum(arr);
		obj.sumOfArray();
	}
	
	void sumOfEvenAndOddNum (int[] arr) {
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i]%2) == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}
		
		System.out.println("Sum of even number : "+evenSum);
		System.out.println("Sum of odd number : "+oddSum);
	}
	
	void sumOfArray() {
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = {0,0,2,1,3,5,2};
		
		int[] sumArray = new int[arr1.length];
		
		for (int i = 0; i < arr2.length; i++) {
			sumArray[i] = arr1[i] + arr2[i]; 
		}
		
		System.out.println("Sum of two array elements : "+Arrays.toString(sumArray));
	}
}
