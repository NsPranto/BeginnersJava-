package string_package;

public class String_Demo6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Naimus Sadat ");
        sb.append("Pranto"); // adding method
        System.out.println("STRING= " + sb);
        sb.delete(0, 13); // delete method
        System.out.println("New STRING= " + sb);
        sb.reverse(); // reverse method
        System.out.println(sb);
    }
}
