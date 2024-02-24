package user;

import java.util.Scanner;

class AuthenticationSystem {
    private User[] users;
    public Scanner scanner;

    public AuthenticationSystem() {
        users = new User[10];
        scanner = new Scanner(System.in);
        
        users[0] = new User("sushant", "1234");
        users[1] = new User("s", "1");
    }

    public void signUp() {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        User newUser = new User(username, password);
       
        // Store the new user in the array (you might want to add error handling for full array)       
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = newUser;
                break;
            }
        }
        System.out.println("Sign up successful.");
    }

    public boolean login() {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        for (User user : users) {
            if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful.");
                return true;
            }
        }
        System.out.println("Invalid username or password.");
        return false;
    }
}