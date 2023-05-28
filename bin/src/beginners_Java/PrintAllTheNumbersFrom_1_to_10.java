package beginners_Java;

public class PrintAllTheNumbersFrom_1_to_10 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<=10; i++) {
            sum=sum+i;
        }
        System.out.println("The sum of numbers between 1 to 10= "+sum);
    }
    
}
