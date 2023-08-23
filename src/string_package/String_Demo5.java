package string_package;

public class String_Demo5 {
    public static void main(String[] args) {
        String s1 = "Naimus ";
        StringBuffer sb = new StringBuffer(s1);
        sb.append("Sadat "); //Adding method with previous existing string
        sb.append("Pranto, "); //Adding method with previous existing string
        sb.append("26"); //Adding method with previous existing string
        System.out.println("Full name= "+sb);

        /*sb.reverse();  //String reverse method
        System.out.println("After reverse= "+sb); */

        sb.delete(0, 6); //String indexes delete method at once
        System.out.println("Afrer deleting some indexes= "+sb);

        sb.setLength(6); //After setting fixed index length and to show that string only
        System.out.println("After fixed indexes position= "+sb);
    }
}
