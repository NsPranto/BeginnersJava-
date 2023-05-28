package array_demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo3_Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();

        number.add(20);
        number.add(-3);
        number.add(18);
        number.add(92);
        number.add(0);
        number.add(2);

        System.out.println("Before sorting: "+number);

        Collections.sort(number);//Arrange in Ascending order
        System.out.println("After sorting in ascending order: "+number);
        Collections.sort(number, Collections.reverseOrder());//Arrange in descending order
        System.out.println("After sorting in Descending order: "+number);
    }
}
