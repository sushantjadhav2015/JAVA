package arrayAssignment;

public class CountRepeatedElemets {
	public static void main(String[] args) {
		int[] arr = {2,2,3,4,3,4,2};
		CountRepeatedElemets Obj = new CountRepeatedElemets();
		Obj.countRepetedNum(arr);
	}
	
	void countRepetedNum(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}
			if (arr[i] != -1) {
				System.out.println(arr[i]+" is repeted at "+count+" times");
			}
		}
		
	}
}
