package string_package;

public class String_Demo3 {
    public static void main(String[] args) {
        String country = "Bangladesh is my country";
        System.out.println("The String is= "+country);

        String s = country.trim();
        System.out.println("After triming(spaces) from the string= " + s);

        char ch = country.charAt(0);//It'll find the character at (0)th index
        System.out.println("Character of (0)th index= "+ch);

        int value = country.codePointAt(0);//It'll find the (ASCII) value of (0)th index -> B-> 66
        System.out.println("ASCII value of B= "+value);

        int position = country.indexOf("n");//It'll find the index number of (n) counting from the begining of the string
        System.out.println("Position of n= "+position);

        position = country.lastIndexOf('n');//It'll find the index number of (n) counting from the ending
        System.out.println("Position of n from last= "+position);
    }
}
