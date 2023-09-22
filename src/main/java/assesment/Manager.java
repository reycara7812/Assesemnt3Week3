package assesment;

import java.util.List;

public class Manager extends Employee{
    public double getManagerDiscount() {
        return managerDiscount;
    }



    public Manager(String names, Size size, List<String> clothingItems) {
        super(names, size, clothingItems);
    }
    private double managerDiscount =discount + 0.5;
}
