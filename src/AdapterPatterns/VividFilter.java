package AdapterPatterns;

public class VividFilter implements Filter{
    @Override
    public void apply(image image) {
        System.out.println("Applying Vivid Filter");
    }
}
