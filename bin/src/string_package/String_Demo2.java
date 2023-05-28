package string_package;

public class String_Demo2 {
    public static void main(String[] args) {
        String FirstName = "Naimus";
        String LastName = " Sadat";
        /*
          String FullName = FirstName + LastName; //String Summetion method
          System.out.println("Full Name= " + FullName);
        */
       
        String FullName = FirstName.concat(LastName); //String Concatination method
        System.out.println("Full Name= " + FullName);

        String UpperName = FullName.toUpperCase(); //String case converting into Upper Case
        System.out.println("Upper Case Name = "+UpperName);

    }
}
