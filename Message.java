import java.time.LocalDateTime;

public class Message {
    private String senderID;
    private String receiverID;
    private String text;
    private LocalDateTime timestamp;
    private boolean isRead;

    public Message(String senderID, String receiverID, String text) {
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.text = text;
        this.timestamp = LocalDateTime.now();
        this.isRead = false;
    }

    public String getSenderID() {
        return senderID;
    }

    public String getReceiverID() {
        return receiverID;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public void markAsUnread() {
        this.isRead = false;
    }

    public void displayMessageDetails() {
        System.out.println("Sender: " + senderID + ", Receiver: " + receiverID +
                ", Text: " + text + ", Timestamp: " + timestamp +
                ", Status: " + (isRead ? "Read" : "Unread"));
    }
}
