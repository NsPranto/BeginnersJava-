package array_demo;

public class FindingOutputProgram_Of_Rows_And_Columns {
    public static void main(String[] args) {
        int[][] number=new int[4][5];
        int k=0;
        
        //Assigning the values
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                number[i][j]=k;
                k++;
            }
        }
        //Printing the position values

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" "+number[i][j]);
            }
            System.out.println();
        }
    }
}
