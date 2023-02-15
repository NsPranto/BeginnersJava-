import java.util.Scanner;

public class Assignment3_ProductDetails {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Scanner input1= new Scanner(System.in);
        int id;
        String title, price, description, category;
        
        System.out.print("Enter your Phone's serial id: ");
        id=input.nextInt();
        
        System.out.print("Enter title: ");
        title=input1.nextLine();
        
        System.out.print("Enter the price: ");
        price=input1.nextLine();
        
        System.out.print("Enter its description: ");
        description=input1.nextLine();
        
        System.out.print("Which category?");
        category=input1.nextLine();

        System.out.println("Id:"+id);
        System.out.println("Title:"+title);
        System.out.println("Price:"+price);
        System.out.println("Description:"+description);
        System.out.println("Category:"+category);
        input.close();
        input1.close();
        
    }
    
}
