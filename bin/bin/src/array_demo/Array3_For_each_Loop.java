package array_demo;

public class Array3_For_each_Loop {
    public static void main(String[] args) {
        String[] names={"Valir","Gord","Zhask","Cyclops","Vale","Cecilion"};

        for (String i : names) {
            System.out.print(" "+i+" ");
        }
        System.out.println("\n"+"Array size= "+names.length);
        System.out.println("\n");  
        
        int[] num={10,20,30,40,50,60,70,80,90,100};
        int sum=0;
        for (int i : num) {
            System.out.println(i);
            sum= sum+i;
        }
        System.out.println("sum= "+sum);
    }
}
