package string_package;

public class String_Demo4 {
    public static void main(String[] args) {
        String s1 = "This is my country";
        System.out.println("s1= " + s1);

        String s2 = s1.replace('n', 'r');// replace method
        System.out.println("s2= " + s2);

        String[] s3 = s1.split("ry"); // split method
        for (String x : s3) {
            System.out.println("s3= " + x);
        }
    }
}
