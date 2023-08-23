package randomtest;

public class RandomNumberGenerator_Demo {
    public static void main(String[] args) {
        /* [Method 1]
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;// when, (3)+1 --> number appears between(1-3) & When,(3) --> number
                                                 // appears between(0-3)
        System.out.println("Random number= " + randomNumber); 
        */

        // [Method 2]
        int randomNumber = (int) (Math.random()*10+1); // when, *10 --> number appears between(0-10) & when,*10+1 --> number appears between(1-10) 
        System.out.println("Random number= " + randomNumber);
    }
}
