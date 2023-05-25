package string_package;

public class String_Demo1 {
    public static void main(String[] args) {
        String s1 = "naimus Sadat"; // String declaration, method-1
        String s2 = new String("Naimus Sadat");// String declaration, method-2

        System.out.println("S1= " + s1);
        System.out.println("S2= " + s2);

        /*
        if (s1.equals(s2)) { // equality checking method of values of two strings is equal or not
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        } 
        */

        int length = s1.length();
        System.out.println("S1 String length= "+length);

        int length2 = s2.length();
        System.out.println("S2 String length= "+length2);


        if (s1.equalsIgnoreCase(s2)) { // equality checking method of values of two strings is equal or not Ignoring Upper/Lower Case
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }

        boolean contains = s1.contains("Sadat");
        System.out.println(contains);

        boolean b = s1.isEmpty();//'isEmpty' method *string empty-> true & *string not empty-> false
        System.out.println("b= "+b);
    }
}
