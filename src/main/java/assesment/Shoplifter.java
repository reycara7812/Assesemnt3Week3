package assesment;

import java.util.List;

public class Shoplifter extends Person{
    public Shoplifter(String names) {
        super(names);
    }

    public Shoplifter(String names, Size size, List<String> clothingItems) {
        super(names, size, clothingItems);
    }
}
