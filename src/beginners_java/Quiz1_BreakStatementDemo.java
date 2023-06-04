package beginners_java;

public class Quiz1_BreakStatementDemo {
    public static void main(String[] args) {
        for (int i=1; i<=100; i=i+2) {
            if (i==11) {
                break;
            }
            System.out.println(i);
            
        }
    }
    
}
