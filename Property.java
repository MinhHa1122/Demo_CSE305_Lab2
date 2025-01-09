public class Property {
   
    private int PropertyID;
    private String Description;
    private int PropertyOwnerId;

    public Property(int propertyID, String description, int propertyOwnerId) {
        this.PropertyID = propertyID;
        this.Description = description;
        this.PropertyOwnerId = propertyOwnerId;
    }

   
    public int getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(int propertyID) {
        this.PropertyID = propertyID;
    }

   
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

  
    public int getPropertyOwnerId() {
        return PropertyOwnerId;
    }

    public void setPropertyOwnerId(int propertyOwnerId) {
        this.PropertyOwnerId = propertyOwnerId;
    }

   
    @Override
    public String toString() {
        return "Property ID: " + PropertyID + "\n" +
               "Description: " + Description + "\n" +
               "Owner ID: " + PropertyOwnerId;
    }
}
