import java.util.ArrayList;
import java.util.List;

public class MessageManager {
    private List<Message> messages;

    public MessageManager() {
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void displayMessagesForContact(String contactID) {
        boolean found = false;
        for (Message message : messages) {
            if (message.getReceiverID().equals(contactID)) {
                message.displayMessageDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No messages for contact ID: " + contactID);
        }
    }

    public void deleteMessagesForContact(String contactID) {
        messages.removeIf(message -> message.getReceiverID().equals(contactID));
        System.out.println("All messages for contact ID " + contactID + " have been deleted.");
    }

    public void markMessagesAsRead(String contactID) {
        for (Message message : messages) {
            if (message.getReceiverID().equals(contactID)) {
                message.markAsRead();
            }
        }
        System.out.println("All messages for contact ID " + contactID + " marked as read.");
    }

    public void searchMessagesBySender(String senderID) {
        boolean found = false;
        for (Message message : messages) {
            if (message.getSenderID().equals(senderID)) {
                message.displayMessageDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No messages found from sender ID: " + senderID);
        }
    }
}
