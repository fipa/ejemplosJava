package refactoring.messageHandling;

public class EmailImapService extends EmailService {

    // incomplete, implemented just for the refactoring exercises

    private static String protocol = "IMAP";

    public String send(String message) {
        return "[" + protocol + "]Email sent with message " + message;
    }

}
