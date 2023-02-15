import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter: ");
        ch=input.next().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'&&ch=='0'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println("Vowel");
        } /*else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Vowel");
        }/*else if(ch=='i'){
            System.out.println("Vowel");
        }else if(ch=='o'){
            System.out.println("Vowel");
        }else if(ch=='u'){
            System.out.println("Vowel");
        }
        /*else if(ch=='A'){
            System.out.println("Vowel");
        }else if(ch=='E'){
            System.out.println("Vowel");
        }else if(ch=='I'){
            System.out.println("Vowel");
        }else if(ch=='O'){
            System.out.println("Vowel");
        }else if(ch=='U'){
            System.out.println("Vowel");
        } */
        else {
           System.out.println("Consonant"); 
        }
    }
}
