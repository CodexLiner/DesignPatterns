package AdapterPatterns;

import java.awt.*;

public class ImageView {
    private image image ;

    public ImageView(image image) {
        this.image = image;
    }
    public void apply(Filter filter){
        filter.apply(image);
    }
}
