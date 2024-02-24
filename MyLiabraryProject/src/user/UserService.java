package user;

public class UserService {
    private AuthenticationSystem authenticationSystem;
    public boolean loggedIn = false;

    public UserService() {
        authenticationSystem = new AuthenticationSystem();
    }

    public void handleUserInput() {
        
        int choice;
        do {
            if (!loggedIn) {
                choice = UserInputUtility.showUserOptions();
                switch (choice) {
                    case 1:
                        loggedIn = authenticationSystem.login(); // Set loggedIn to true if login successful
                        break;
                    case 2:
                        authenticationSystem.signUp();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        break;
                }
            } else {
                choice = UserInputUtility.showAdminOptions();
                switch (choice) {
                    case 1:
                        // Show student records
                    	UserInputUtility.studentOptions();
                        break;
                    case 2:
                        // Show book records
//                        showBookRecords();
                        break;
                    case 3:
                        // Manage books
//                        manageBooks();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                }
            }
        } while (choice != 3 && choice != 4);
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.handleUserInput();
        
//        if (loggedIn) {
//			
//		}
    }
}
