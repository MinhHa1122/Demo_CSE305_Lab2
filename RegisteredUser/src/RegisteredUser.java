import java.util.ArrayList;
import java.util.List;

public class RegisteredUser {
	 
    private List<String> listOfUsers;

   
    public RegisteredUser() {
        listOfUsers = new ArrayList<>();
    }
 
    
    public void addUser(String user) {
        if (user != null && !user.isEmpty()) {
            listOfUsers.add(user);
            System.out.println("User added: " + user);
        } else {
            System.out.println("Invalid user name");
        }
    }

   
    public void removeUser(String user) {
        if (listOfUsers.contains(user)) {
            listOfUsers.remove(user);
            System.out.println("User removed: " + user);
        } else {
            System.out.println("User not found: " + user);
        }
    }

   
    public void printUsers() {
        System.out.println("List of Registered Users: " + listOfUsers);
    }

   
    public static void main(String[] args) {
        RegisteredUser registeredUser = new RegisteredUser();

      
        registeredUser.addUser("John");
        registeredUser.addUser("Alice");
        registeredUser.addUser("Bob");

      
        registeredUser.printUsers();

       
        registeredUser.removeUser("Alice");

       
        registeredUser.printUsers();
    }
}
