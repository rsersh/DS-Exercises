package datastructurestest;
import java.util.Random;
/**
 *
 * @author rsersh
 */
public class GenericCoin {
    
    private static boolean tails;
    private static boolean heads;
    static Counter tailcounter = new Counter();
    static Counter headcounter = new Counter();
    
    public GenericCoin() {
        tails = true;
        heads = false;
    }
    
    public static void checkCoin() {
        if ((tails == true) && (heads == false)) {
            System.out.println("Tail side is UP.");
            tailcounter.increaseCount();
        } else if ((heads == true) && (tails == false)) {
            System.out.println("Head side is UP.");
            headcounter.increaseCount();
        } else {
            System.out.println("Error flipping coin");
        }
    }
    
    public static void coinToss() {
        Random r = new Random();
        tails = r.nextBoolean();
        if (tails == true) { heads = false; }
        else { heads = true; }
    }
    
    public static void main(String[] args) {
        
        int totalHeads = 0;
        int totalTails = 0;
        
        GenericCoin coin1 = new GenericCoin();
        System.out.println("Now checking coin 1.");
        checkCoin();
        
        for (int i = 1; i < 11; i++) {
            System.out.println("Flipping coin..");
            coinToss();
            checkCoin();
        }
        System.out.printf("Total number of heads: %s\n", 
                headcounter.toString());
        System.out.printf("Total number of tails: %s\n", 
                tailcounter.toString());
    
    }
    
    
    
    
    
}
