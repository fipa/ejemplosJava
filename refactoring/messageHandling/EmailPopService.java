package refactoring.messageHandling;

public class EmailPopService extends EmailService {

    // incomplete, implemented just for the refactoring exercises

    private static String protocol = "POP";

    public String send(String message) {
        return "[" + protocol + " email sent]" + message;
    }

}
