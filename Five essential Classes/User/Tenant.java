
import java.util.ArrayList;
import java.util.List;

public class Tenant {
    // Attributes
    private User user;
    private List<String> listOfContract;

    // Constructor
    public Tenant(User user) {
        this.user = user;
        this.listOfContract = new ArrayList<>();
    }

    // Getter and Setter methods for attributes
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getListOfContract() {
        return listOfContract;
    }

    public void setListOfContract(List<String> listOfContract) {
        this.listOfContract = listOfContract;
    }

    // Method: requestCreateRentalContract
    public void requestCreateRentalContract(String contractDetails) {
        if (contractDetails != null && !contractDetails.isEmpty()) {
            listOfContract.add(contractDetails);
            System.out.println("Rental contract created: " + contractDetails);
        } else {
            System.out.println("Invalid contract details.");
        }
    }

    // Method: requestTerminateRentalContract
    public void requestTerminateRentalContract(String contractDetails) {
        if (listOfContract.contains(contractDetails)) {
            listOfContract.remove(contractDetails);
            System.out.println("Rental contract terminated: " + contractDetails);
        } else {
            System.out.println("Contract not found: " + contractDetails);
        }
    }

    // For demonstration: Print Tenant info and contracts
    public void printTenantInfo() {
        System.out.println("UserID: " + user.getUserID());
        System.out.println("Email: " + user.getEmail());
        System.out.println("UserType: " + user.getUserType());
        System.out.println("Contracts: " + listOfContract);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create a new User
        User user1 = User.createUser("janeDoe", "password123", "jane@example.com", "Tenant");

        // Create a new Tenant with that user
        Tenant tenant1 = new Tenant(user1);
        tenant1.printTenantInfo();

        // Request to create a rental contract
        tenant1.requestCreateRentalContract("Rental contract for Apartment 101");
        tenant1.printTenantInfo();

        // Request to terminate a rental contract
        tenant1.requestTerminateRentalContract("Rental contract for Apartment 101");
        tenant1.printTenantInfo();
    }

}
