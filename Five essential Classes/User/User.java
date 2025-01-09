public class User {

    // Attributes
    private String userID;
    private String password;
    private String email;
    private String userType;

    // Constructor
    public User(String userID, String password, String email, String userType) {
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    // Getter and Setter methods for each attribute
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    // Operation: CreateUser
    public static User createUser(String userID, String password, String email, String userType) {
        return new User(userID, password, email, userType);
    }

    // Operation: ResetPassword
    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }

    // For demonstration purposes: Print user info
    public void printUserInfo() {
        System.out.println("UserID: " + userID);
        System.out.println("Email: " + email);
        System.out.println("UserType: " + userType);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create a new user
        User user1 = User.createUser("johnDoe", "12345", "john@example.com", "Admin");
        user1.printUserInfo();

        // Reset password
        user1.resetPassword("newPassword123");
        System.out.println("\nPassword has been reset.");

        // Print updated user info
        user1.printUserInfo();
    }
}
