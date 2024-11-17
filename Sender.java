import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Sender {
    private static final String RECEIVER_IP = "192.168.100.43"; // Replace with Receiver's IP
    private static final int PORT = 12345; // Port number

    public static void main(String[] args) {
        try (Socket socket = new Socket(RECEIVER_IP, PORT)) {
            System.out.println("Connected to receiver at " + RECEIVER_IP + ":" + PORT);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            Scanner scanner = new Scanner(System.in);
            String message;

            while (true) {
                System.out.print("Enter message (type 'exit' to quit): ");
                message = scanner.nextLine();
                out.println(message); // Send message to receiver

                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting chat...");
                    break;
                }

                // Receive acknowledgment
                String ack = in.readLine();
                System.out.println("Receiver: " + ack);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
