package user;

import java.util.Scanner;

import studentRecord.AddStudents;

class UserInputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static int showUserOptions() {
        int choice;
        do {
            System.out.println("**** Library Management Application ****");
            System.out.println("1. Login");
            System.out.println("2. Sign up");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice. Please enter a number from 1 to 3.");
            }
        } while (choice < 1 || choice > 3);
        return choice;
    }
    
    public static int showAdminOptions() {
        int choice;
        do {
            System.out.println("**** Admin Page ****");
            System.out.println("1. Student Record");
            System.out.println("2. Book Record");
            System.out.println("3. Manage Books");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return choice;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        } while (true);
    }
    
    public static int studentOptions() {
        int choice;
        AddStudents addStudents = null;
        do {
            System.out.println("**** Add student ****");
            System.out.println("1. Add student");
            System.out.println("2. Display Student list");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
            case 1:
                if (addStudents == null) {
                    addStudents = new AddStudents();
                }
                addStudents.addStudent();
                break;
            case 2:
                if (addStudents != null) {
                    addStudents.diaplayStudentList();
                } else {
                    System.out.println("No students added yet.");
                }
                break;
                case 3:
                	System.out.println("Exiting...");
                	return choice;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.");
            }
        } while (true);
    }
}
