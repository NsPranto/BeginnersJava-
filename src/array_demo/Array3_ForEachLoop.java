package array_demo;

public class Array3_ForEachLoop {
    public static void main(String[] args) {
        /*
         * String[] names = new String[4];
         * 
         * names[0]="Valir";
         * names[1]="Cecilion";
         * names[2]="Gord";
         * names[3]="Cyclops";
         * 
         * Or another method--->
         */

        String[] names = { "Valir", "Cecilion", "Gord", "Cyclops" };
        System.out.println("Array size= " + names.length);
        /*
         * for (int i = 0; i < names.length; i++) { //normal printing
         * System.out.println(names[i]);
         * }
         */
        for (String x : names) { // printing using For Each loop
            System.out.println(x);
        }

        int sum = 0;
        int[] number = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }; // For Each loop another example,--> int typed array
                                                                    // printing & sum
        for (int i : number) {
            System.out.println(i); // For printing the values only
            sum = sum + i; // Summetion of all the values
        }
        System.out.println("Sum= " + sum); // printing summetions of values

    }
}
