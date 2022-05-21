package Decorator;

public class EncryptedCloudStream implements Stream{
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        stream.write(ecnrypt(data));
    }
    private String ecnrypt(String data){
        return "!@#$%^&*()_";
    }
}
