package assesment;
import java.util.*;
public abstract class Person {



    private String names;
    private Size size;

    private List<String> clothingItems;




    public Person(String names) {
        this.names = names;
    }

    public Person(String names, Size size, List<String> clothingItems) {
        this.names = names;
        this.size = size;
        this.clothingItems = clothingItems;
    }



    public String getNames() {
        return names;

    }

    public void setNames(String names) {
        this.names = names;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public List<String> getClothingItems() {
        return clothingItems;
    }
    public void setClothingItems(List<String> clothingItems) {
        this.clothingItems = clothingItems;
    }

    /* okay so I made 3 varibles which are size names and a list form cothles items and I made it
    an arraylsit so is more accesbbible and did getters and setters and 2 constructors
     */
}