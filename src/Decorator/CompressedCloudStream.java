package Decorator;

public class CompressedCloudStream implements Stream{
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        stream.write(data);
    }
    private String compress(String data){
        return data.substring(2);
    }
}
