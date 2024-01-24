import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    private static final int MESSAGE_START_IND = 2;
    private static final int USER_START_IND = 5;
    private static final String NEWLINE = "\n";
    private static final String COLON_MESSAGE = ": ";
    private static final String ERROR_URL = "404 not found!";

    String chat = "";

    public String handleRequest(URI url) {
        if (url.getPath().contains("/add-message")) {
            if (url.getQuery() == null) {
                return String.format(chat);
            }

            String[] query = url.getQuery().split("&");
            String user = query[1].substring(USER_START_IND);
            String message = query[0].substring(MESSAGE_START_IND);
            
            this.chat += user + COLON_MESSAGE + message + NEWLINE;
            
            return String.format(chat);
        }
        return String.format(ERROR_URL);
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
