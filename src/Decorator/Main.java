package Decorator;

public class Main {
    public static void main(String[] args) {
        StoreData(new EncryptedCloudStream(new CloudStream()));
    }
    public static void StoreData(Stream stream){
        stream.write("123-123-55665-8892");
    }
}
