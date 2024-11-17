import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        MessageManager messageManager = new MessageManager();
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("001", "Meer"));
        contacts.add(new Contact("002", "Moona"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Messaging Application ===");
            System.out.println("1. View Contacts");
            System.out.println("2. Send Message");
            System.out.println("3. Receive Messages");
            System.out.println("4. View Messages");
            System.out.println("5. Delete Messages");
            System.out.println("6. Mark Messages as Read");
            System.out.println("7. Search Messages by Sender");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.println("Contacts:");
                    for (Contact contact : contacts) {
                        contact.displayContactDetails();
                    }
                }
                case 2 -> {
                    System.out.print("Enter receiver ID: ");
                    String receiverID = scanner.nextLine();
                    System.out.print("Enter your message: ");
                    String text = scanner.nextLine();
                    messageManager.addMessage(new Message("You", receiverID, text));
                }
                case 3 -> {
                    Receiver receiver = new Receiver();
                    receiver.receiveMessages(12345); // Replace with your port
                }
                case 4 -> {
                    System.out.print("Enter contact ID: ");
                    String contactID = scanner.nextLine();
                    messageManager.displayMessagesForContact(contactID);
                }
                case 5 -> {
                    System.out.print("Enter contact ID: ");
                    String contactID = scanner.nextLine();
                    messageManager.deleteMessagesForContact(contactID);
                }
                case 6 -> {
                    System.out.print("Enter contact ID: ");
                    String contactID = scanner.nextLine();
                    messageManager.markMessagesAsRead(contactID);
                }
                case 7 -> {
                    System.out.print("Enter sender ID: ");
                    String senderID = scanner.nextLine();
                    messageManager.searchMessagesBySender(senderID);
                }
                case 8 -> {
                    System.out.println("Exiting application...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
