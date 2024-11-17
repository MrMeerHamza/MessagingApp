public class Contact {
    private String contactID;
    private String name;

    public Contact(String contactID, String name) {
        this.contactID = contactID;
        this.name = name;
    }

    public String getContactID() {
        return contactID;
    }

    public String getName() {
        return name;
    }

    public void displayContactDetails() {
        System.out.println("Contact ID: " + contactID + ", Name: " + name);
    }
}
