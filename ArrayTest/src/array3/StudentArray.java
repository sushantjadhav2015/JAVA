package array3;

import java.util.Scanner;

public class StudentArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		boolean res= sc.hasNextInt();
		
		if(res) {
			int val = sc.nextInt();
			System.out.println(val);
		}
	
		System.out.println(res);
		
		StudentArray obj = new StudentArray();
		
		Student[] stuArray = obj.addStudentInArray();
		
		obj.printStudent(stuArray);
		
		StudentAnother saObj = new StudentAnother();
		saObj.printArray(stuArray);
		
	}
	
	void printStudent(Student[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			Student sObj = arr[i];
			
			//System.out.println("Roll No is :"+sObj.rno);
			//System.out.println("Name is :"+sObj.name);
			
			//System.out.println("Roll No is :"+sObj.getRno());
			//System.out.println("Name is :"+sObj.getName());
			
			System.out.println(sObj);
			//sObj.toString1();
			
		}
	}
	
	Student[] addStudentInArray() {
		
		Student obj1 = new Student();
		//obj1.rno = -10;
		obj1.setRno(10);
		//obj1.name = "Rajendra";
		obj1.setName("Rajendra");
		
		Student obj2 = new Student();
		//obj2.rno = -11;
		obj2.setRno(11);
		//obj2.name="Shivam";
		obj2.setName("Shivam");
		
		Student obj3 = new Student();
		//obj3.rno = -12;
		obj3.setRno(12);
		//obj3.name = "Kirti";
		obj3.setName("Kirti");
		
		Student[] stuArray = new Student[3];
		
		stuArray[0] = obj1;
		stuArray[1] = obj2;
		stuArray[2] = obj3;
		
		return stuArray;
		
	}

}
