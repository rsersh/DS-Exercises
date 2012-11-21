package datastructurestest;
import java.util.Random;
/**
 *
 * @author rsersh
 */
public class GenericCoin {
    
    private static boolean tails;
    private static boolean heads;
    Counter tailcounter = new Counter();
    Counter headcounter = new Counter();
    
    public GenericCoin() {
        tails = true;
        heads = false;
        System.out.println("Coin created, TAIL side up");
    }
    
    public void checkCoin() {
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
    
    public String checkTailCounter() {
        return tailcounter.toString();  
    }
    public String checkHeadCounter() {
        return headcounter.toString();
    }
    
    /*
    public void coinToss() {
        Random r = new Random();
        tails = r.nextBoolean();
        if (tails == true) { heads = false; tailcounter.increaseCount(); }
        else { heads = true; headcounter.decreaseCount(); }
    }
     * 
     */
    
    public void reset() {
        int n = 0;
        tailcounter.setCount(n);
        headcounter.setCount(n);
        System.out.println("The head counter has been reset to: " +
                headcounter.toString());
        System.out.println("The tail counter has been reset to: " + 
                tailcounter.toString()); 
    }
    
    public void coinToss(int numTosses) {
        Random r = new Random();
        for (int i = 1; i <= numTosses; i++){
            tails = r.nextBoolean();
            if (tails == true) { 
                heads = false;
                tailcounter.increaseCount();            
            } else {
                heads = true;
                headcounter.increaseCount();
            }
        }
    }
    
    public static void main(String[] args) {
        
        GenericCoin coin1 = new GenericCoin();
        GenericCoin coin2 = new GenericCoin();
        System.out.println("Now checking coin1.");
        coin1.checkCoin();
        coin1.coinToss(1);
        System.out.println("Coin1 after toss: ");
        coin1.checkCoin();
        
        System.out.println("************");
        System.out.println("Now checking coin2.");
        coin2.checkCoin();
        
        //insert user input
        
        coin2.reset();
        System.out.println("Now tossing coin2 15 times");
        coin2.coinToss(15);
        
        System.out.printf("Total number of heads: %s\n", 
                coin2.checkHeadCounter());
        System.out.printf("Total number of tails: %s\n", 
                coin2.checkTailCounter());
        
        System.out.printf("*********\n");
        System.out.printf("Coin 1 has had %s heads.\n", 
                coin1.checkHeadCounter());
        System.out.printf("Coin 1 has had %s tails.\n", 
                coin1.checkTailCounter());   
    } 
}
