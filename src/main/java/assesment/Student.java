package assesment;

import java.util.List;

public class Student extends Costumer implements Discountable{

    public static final double discount = 0.5;


    private static long studentId;
    private long addStudentId;

    public Student(String names, Size size, List<String> clothingItems) {
        super(names, size, clothingItems);
    }

    public Student(String names, Size size, List<String> clothingItems, long studentId) {
        super(names, size, clothingItems);
        Student.studentId = addStudentId;
        addStudentId++;
    }

   public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public double calculateDiscount(Clothing clothing) {
        return 0;
    }
}
