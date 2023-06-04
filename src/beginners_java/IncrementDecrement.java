package beginners_java;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x=25;
        int y;

        y=--x;//pre decrement, x=24
        System.out.println("y="+y);
        y=x--;//post decrement, x=24
        System.out.println("y="+y);
        y=++x;//pre increment, x=23>>24
        System.out.println("y="+y);
        y=x++;//post increment, x=24
        System.out.println("y="+y);
    }
    
}
