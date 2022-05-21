package AdapterPatterns;

public class Main {
    public static void main(String[] args) {
        var imageview = new ImageView(new image());
        imageview.apply(new VividFilter());
    }
}
