package string_package;

public class WrapperClass_Demo {
    public static void main(String[] args) {
        int x = 30;
        Integer y = Integer.valueOf(x); // Converting Primitive typed data into ---> Object typed data
        System.out.println("y= " + y);
        Integer z = y; // (Or) Integer.valueOf(x) ---> Autoboxing
        System.out.println("z= " + z);

        Double d = new Double(10.25); // Declaring Object typed data type
        System.out.println("d= " + d);
        double e = d.doubleValue(); // Converting Object typed data into ---> Primitive typed data
        System.out.println("e= " + e);
        double f = d; // (Or) d.doubleValue(); ---> Unboxing
        System.out.println("f= " + f);

    }
}
