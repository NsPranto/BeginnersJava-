package array_demo;

import java.util.ArrayList;
//import java.util.Iterator;

public class ArrayList_Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size= " + number.size());
        // adding elements..
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        /*
          Printing by (For each) loop...
          for (int x : number) {
          System.out.print(" "+x);
          }
         */

        /*
          Printing by Iterator...
          Iterator itr= number.iterator();
          while(itr.hasNext()) {
          System.out.print(" "+itr.next());
          }
         */

        //For normally Printing by putting name of the arraylist...
        System.out.println("Atrray List Contains: "+number);
        System.out.println();
        System.out.println("Size= " + number.size());

        /*
        Removing elements...
        number.remove(2);
        System.out.println("After removing 2nd index, the Array List Contains: "+number);
        
        number.removeAll(number);
        System.out.println("After removing all, the Arraylist: "+number);
        */
        
        /*
        Clearing Array List..
        number.clear();
        System.out.println("After clear, array list contains: "+number);
        */
        
        //Checking Arraylist empty or not...
        Boolean check=number.isEmpty();
        System.out.println("Array list empty? "+check);
        
        //checking any specific number is in the list..
        Boolean contains=number.contains(30);
        System.out.println("Is 30 in the list? : "+contains);

        //checking the position of number..
        int index=number.indexOf(40);
        System.out.println("The index of 40 is: "+index);

        //To replace any value on the existing index...
        number.set(3, 50);
        System.out.println("After setting 50, the updated arraylist is: "+number);

        //To add any value on the existing index...
        int x=number.get(0);
        System.out.println("Index 0= "+x);
    }
}
