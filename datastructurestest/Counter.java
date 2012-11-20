package datastructurestest;

/**
 * Object used to record a count of nonnegative whole numbers.
 * @author Rachel
 */
public class Counter {
    private int count;
    
    public void setCount(int n) {
        count = n;
    }
    public int getCount() {
        return count;
    }
    public void increaseCount() {
        ++count;
    }
    public void decreaseCount() {
        if ((count-1) > 0) {
            --count;
        } else {
            System.out.println("Count is at zero.");
        }
    }
    
    public boolean isZero() {
        return (count == 0);
    }
    public void zeroTest() {
        if (this.isZero()) {
            System.out.println("Counter is equal to zero.");
        } else {
            System.out.println("Counter is NOT equal to zero.");
        }
    }
    
      @Override
    public String toString() {
        String s = "" + count;
        return s;
    }
       
    
    public static void main(String[] args) {
        
        Counter aCounter = new Counter();
        Integer x = new Integer(aCounter.getCount());
        String s = x.toString();
        System.out.printf("\n%s\n", s);
        aCounter.decreaseCount();
        Integer y = new Integer(aCounter.getCount());
        String b = y.toString();
        System.out.printf("\n%s\n", b);
        Counter bCounter = new Counter();
        bCounter.setCount(8);
        bCounter.increaseCount();
        int z;
        z = bCounter.getCount();
        System.out.print(z);
        System.out.println();
        bCounter.decreaseCount();
        String d = bCounter.toString();
        System.out.println(d);
        bCounter.zeroTest();
        aCounter.zeroTest();
    }
    
}