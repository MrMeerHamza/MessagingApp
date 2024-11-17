# MessagingApp
A simple console-based messaging application built in Java, enabling users to manage contacts, send and receive messages, and perform various message operations. The application also demonstrates client-server communication using socket programming.

# Features
Contact Management
View and manage contact details.
Messaging
Send messages to contacts.
Receive messages from other users.
View, delete, and search messages.
Mark messages as read/unread.
Client-Server Communication
Utilize socket programming to send and receive messages over a network.

# How It Works
Components
Contact: Represents individual user contact details.
Message: Represents a message with details such as sender, receiver, timestamp, and status (read/unread).
Message Manager: Handles message storage and operations like adding, deleting, and searching messages.
Sender: Sends messages to a receiver over a network.
Receiver: Listens for and processes incoming messages over a specified port.

# Flow
Start the Receiver:
Run the Receiver on the target machine to listen for messages.
Use the MainApp:
Run the main application to view contacts, send messages, and perform other operations.
Start the Sender:
Run the Sender to send messages to the receiver over a network connection.
