package assesment;

import java.util.List;

public class Costumer extends Person{
    public Costumer(String names, Size size, List<String> clothingItems) {
        super(names, size, clothingItems);
    }



    public void printCostumerName(){
        System.out.println("Customer Name:" + getNames());
    }




}
