package beginners_java;

public class MathClassDemo {
    public static void main(String[] args) {
        int x=2;
        int y=4;

        int max=Math.max(x, y);
        System.out.println("Maximum= "+max);

        int min=Math.min(x, y);
        System.out.println("Minimum= "+min);

        int abs=Math.abs(y);
        System.out.println("Absolute of y= "+abs);

        double pow=Math.pow(x, y);
        System.out.println("x to the power y= "+pow);

        int round=Math.round(8.8f);
        System.out.println("Round of 8.8 is= "+round);

        double PI=Math.PI;
        System.out.println("PI="+PI);

        double E=Math.E;
        System.out.println("E="+E);

    }
    
}
