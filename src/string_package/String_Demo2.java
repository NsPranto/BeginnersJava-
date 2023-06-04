package string_package;

public class String_Demo2 {
    public static void main(String[] args) {
        String firstName = "Naimus Sadat ";
        String lastName = "Pranto ";
        /*
        String fullName = firstName + lastName; //Adding strings (Normal method) 
        System.out.println("Full name = " + fullName);
        */

        String fullName = firstName.concat(lastName); //Adding strings(cancatination method) 
        System.out.println("Full Name= "+fullName);

        String upperName= fullName.toUpperCase();
        System.out.println("Full name = "+upperName);//String uppercasing method
        
        String lowerName= fullName.toLowerCase();
        System.out.println("Full name = "+lowerName);//String lowercasing method

        Boolean first= firstName.startsWith("Nai");//prefix checking
        System.out.println(first);

        Boolean last= lastName.endsWith("to");//suffix checking
        System.out.println(last);

        System.out.println("\n");

        String[] names = {"valir","vale,","cecilionn","Zhask"};
        for (String xString : names) {   //ForEach loop(Printing strings sequancially)
            System.out.println(xString);
        }

        System.out.println("\n");
        
        String[] names2 = {"valir","vale,","cecilionn","Zhask"};
        for (int i = 0; i<3; i++) {      //For loop(Printing strings sequancially)
            System.out.println(names2[i]);
        }

        
    }
}
