package array2;

public class StudentArray {
	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.rno = 10;
		obj1.name = "Sushant";
		
		Student obj2 = new Student();
		obj2.rno = 11;
		obj2.name = "ketan";
		
		Student obj3 = new Student();
		obj3.rno = 12;
		obj3.name = "Ashitosh";
		
		Student obj4 =new Student();
		obj4.rno = 13;
		obj4.name = "Rohit";
		
		Student[] stuArray = new Student[4];
		
		stuArray[0] = obj1;
		stuArray[1] = obj2;
		stuArray[2] = obj3;
		stuArray[3] = obj4;
		
		StudentArray obj = new StudentArray();
		obj.getStudentData(stuArray);
	}
	
	void getStudentData(Student[] arr) {
		for (Student student : arr) {
			System.out.println("Object of Studenet : "+student.name);
		}
	}
}
