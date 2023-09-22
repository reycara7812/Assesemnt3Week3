package assesment;

import java.util.List;

public class Employee extends Costumer implements Discountable {


    public static final double discount = 0.10;


    public Employee(String names, Size size, List<String> clothingItems) {
        super(names, size, clothingItems);
    }

    public void printEmployeePriceAfterDiscount(double discount) {
        double originalPrice = Clothing.getPrice();
        double discountedPrice = originalPrice * (1 - discount);

        System.out.println(getNames() + "clothing Price after " + (discount * 100) + "% Discount: $" + discountedPrice);
    }


    public double calculateDiscount(Clothing clothing) {

        double originalPrice = clothing.getPrice();
        return originalPrice * discount;
    }
}
