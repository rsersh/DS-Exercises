package datastructurestest;

/**
 *
 * @author rsersh
 */
public enum Rank {
    
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6),
        SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11),
        QUEEN(12), KING(13);
        
    private final int points;
    private Rank(int n) {
        points = n;
    }
    
    public int getPoints() {
        return points;
    }
    
    private boolean isFace(){
        boolean result = false;
        int test = getPoints();
        if ( test == 11 || test == 12 || test == 13 ) {
          result = true;  
        } 
        return result;
    }
    
    @Override
    public String toString() {
        String result = "";
        result += getPoints();
        return result;
    }
    
    public static void main(String[] args) {
        
        for (Rank nextRank : Rank.values())
            System.out.println(nextRank + " has ordinal value: " 
                    + nextRank.ordinal());
        
    }
}
