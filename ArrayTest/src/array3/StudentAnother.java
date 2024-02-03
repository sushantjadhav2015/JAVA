package array3;

public class StudentAnother {
	
	
	void printArray(Student[] arr) {
	
		System.out.println("Inside StudentAnother class ");
		
		for (Student sObj : arr) {
			
			//System.out.println("Roll No is :"+sObj.rno);
			//System.out.println("Name is :"+sObj.name);
			
			//System.out.println("Roll No is :"+sObj.getRno());
			//System.out.println("Name is :"+sObj.getName());
			
			System.out.println(sObj.toString());
			//sObj.toString1();
		}
		
	}

}
