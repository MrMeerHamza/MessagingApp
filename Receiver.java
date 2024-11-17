import java.io.*;
import java.net.*;

public class Receiver {

    public void receiveMessages(int port) {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Receiver is running on port " + port + "...");
            System.out.println("Waiting for messages...");

            Socket socket = serverSocket.accept();
            System.out.println("Connection established!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Receive messages
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Received message: " + message);
                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Sender disconnected.");
                    break;
                }
            }

        } catch (IOException e) {
            System.err.println("Error in Receiver: " + e.getMessage());
        }
    }
}
