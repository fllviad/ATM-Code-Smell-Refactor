
// Refactor for Long Parameter List
// Original method had too many parameters
// Solution: Combine into a UserData class

public class RegisterUserRefactored {
    public static void main(String[] args) {
        UserData data = new UserData("Ade", "ade@email.com", "ade123", "123456", "Jakarta");
        registerUser(data);
    }

    public static void registerUser(UserData data) {
        System.out.println("User registered:");
        System.out.println("Name: " + data.name);
        System.out.println("Email: " + data.email);
        System.out.println("Username: " + data.username);
        System.out.println("Address: " + data.address);
    }
}

class UserData {
    String name, email, username, password, address;

    public UserData(String name, String email, String username, String password, String address) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.address = address;
    }
}
