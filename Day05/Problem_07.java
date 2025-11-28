import java.util.Scanner;
interface Sender {
    void send(String message);
}

interface Receiver {
    void receive(String message);
}

class EmailService implements Sender, Receiver {
    public void send(String message) {
        System.out.println("Email Sent: " + message);
    }
    public void receive(String message) {
        System.out.println("Email Received: " + message);
    }
}

class SMSService implements Sender {
    public void send(String message) {
        System.out.println("SMS Sent: " + message);
    }
}

public class Problem_07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sender emailSender = new EmailService();
        Receiver emailReceiver = new EmailService();
        Sender smsSender = new SMSService();

        System.out.print("Enter message to send using Email: ");
        String m1 = sc.nextLine();
        emailSender.send(m1);

        System.out.print("Enter message to receive using Email: ");
        String m2 = sc.nextLine();
        emailReceiver.receive(m2);

        System.out.print("Enter SMS message to send: ");
        String m3 = sc.nextLine();
        smsSender.send(m3);
    }
}
