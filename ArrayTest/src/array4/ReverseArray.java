package array4;

import java.util.Iterator;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		ReverseArray objArray = new ReverseArray();
		objArray.reverseArray(arr);
	}
	
	void reverseArray(int[] arr) {
		int[] arr2 = new int[arr.length];
		int j = 0;
		
		for (int i = arr.length-1; i >= 0; i--) {
			arr2[j] = arr[i];
			j++;
		}
		
		for (int i : arr2) {
			System.out.println(i);
			
		}
	}
}
