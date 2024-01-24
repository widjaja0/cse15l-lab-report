import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    private static final String NEWLINE = "\n";
    private static final String COLON_MESSAGE = ": ";
    private static final String INVALID_URL_PROMPT = "Invalid url!";
    private static final String ERROR_URL = "404 not found!";

    String chat = "";

    public String handleRequest(URI url) {
        if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("&");
            if(parameters[0].contains("s=") && parameters[1].contains("user=")) {
                this.chat += parameters[1].split("user=")[1] + COLON_MESSAGE 
                    + parameters[0].split("s=")[1] + NEWLINE;
                return String.format(chat);
            }
            else {
                return String.format(INVALID_URL_PROMPT);
            }
        }
        else {
            return String.format(ERROR_URL);
        }
    }
}

class ChatServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
