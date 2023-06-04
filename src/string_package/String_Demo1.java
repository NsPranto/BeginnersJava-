package string_package;

public class String_Demo1 {
    public static void main(String[] args) {
        String s1 = "Naimus Sadat";//calling method 1
        System.out.println("s1= "+s1); 

        String s2 = new String("naimus Sadat");//calling method 2
        System.out.println("s2= "+s2);

        char[] s3 = {'p','r','a','n','t','o'};
        System.out.println(s3); 

        int length= s1.length();
        System.out.println("Lenght of s1= "+length);

        if (s1.equals(s2)) {  //equality checking method 1
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }

        if (s1.equalsIgnoreCase(s2)) {  //equality checking method 2 (After Ignoring Case)
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }

        Boolean contains = s1.contains("Sadat"); //To check any part exists in the main string or not[yes = true , no = false]
        System.out.println(contains);

        Boolean empty = s1.isEmpty();//to check the main string empty or not
        System.out.println("Is s1 epmty? = "+empty);

        
    }
}
