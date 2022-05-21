package FacadePatterns;

public class Main {
    public static void main(String[] args) {
       var server = new Notification();
       var connection = server.connect("192.13655");
       var authKey = server.auth("55455" , "keyboard");
       server.send(authKey , new Message() , "192.13655");
       connection.disconnect();
    }
}
