package FacadePatterns;

public class Notification {

    public Connection connect(String ip){
        return  new Connection();
    }
    public AuthToken auth(String id , String key){
        return new AuthToken();
    }
    public void send(AuthToken authToken , Message message , String ip){
        System.out.println("Sending message");
    }
}
