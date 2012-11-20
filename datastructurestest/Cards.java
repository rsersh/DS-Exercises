package datastructurestest;

/**
 *
 * @author Rachel
 */
public class Cards {
    
    enum Suit {
        CLUBS("black"), HEARTS("red"), SPADES("black"), DIAMONDS("red");
    private final String color;
    
    private Suit(String suitColor) {
        color = suitColor;
    }
    
    public String getColor() {
        return color;
    }
  }   

    public static void main(String[] args) {

        for (Suit nextSuit: Suit.values()) {
            System.out.println(nextSuit + " are " + nextSuit.getColor() +
                    " and have an ordinal value of " + nextSuit.ordinal());
        }   
        
    }

}

