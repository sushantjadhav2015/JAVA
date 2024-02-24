package studentRecord;

import java.util.Arrays;
import java.util.Scanner;

public class AddStudents {
	private Student[] students;
    public Scanner scanner;

    public AddStudents() {
    	scanner = new Scanner(System.in);
    	System.out.println("Enter Total number of student you want to add :");
    	int arrayLength = scanner.nextInt();
    	students = new Student[arrayLength];
        
//        students[0] = new Student(1, "Joy");
//        students[1] = new Student(2, "Alexa");
    }

    public void addStudent() {
    	int index = 0;
    	do {
            System.out.println("Enter Roll number:");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Enter student name:");
            String studentName = scanner.nextLine();
            Student newStudent = new Student(rollNumber, studentName);
                
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                	students[i] = newStudent;
                    break;
                }
            }
            
            index++;
        
    	}while(index < students.length);
    	
    	if (index == students.length) {
    		System.out.println("Student added successfully"+Arrays.toString(students));
		}
    }
    
    public void diaplayStudentList() {
//    	System.out.println("Student added successfully"+Arrays.toString(students));
    	System.out.println("List of Students:");
        for (Student student : students) {
            if (student != null) {
                System.out.println("Roll Number: " + student.getRollNo() + ", Name: " + student.getName());
            }
	}
   }
}
