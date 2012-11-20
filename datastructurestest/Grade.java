package datastructurestest;

/**
 *
 * @author Rachel
 */
public class Grade {

    public enum LetterGrade {
        A("A", 4.0), A_MINUS("A-", 3.7), B_PLUS("B+", 3.3),
        B("B", 3.0), B_MINUS("B-", 2.7), C_PLUS("C+", 2.3),
        C("C", 2.0), C_MINUS("C=", 1.7), D_PLUS("D+", 1.3),
        D("D", 1.0), 
        F("F", 0.0);
    
    private final String lettergrade;
    private final double points;
    
    private LetterGrade(String letter, double value) {
        lettergrade = letter;
        points = value;
    }
    
    public String getGrade() {
        return lettergrade;
    }
    public double getPoints() {
        return points;
    }
    
    @Override
    public String toString() {
        return getGrade();
    }
  }
    
    public static void main(String[] args) {
        LetterGrade quiz1 = LetterGrade.B_MINUS;
        LetterGrade quiz2 = LetterGrade.A_MINUS;
        LetterGrade quiz3 = LetterGrade.B_PLUS;
        System.out.println(quiz1);
        String grade = quiz2.getGrade();
//        double points = quiz2.getPoints();
        System.out.printf("\nYour grade for quiz 2 is: %s\n", grade);
        System.out.println(LetterGrade.A_MINUS);
        //System.out.printf("Points: %d", points

        int n = 5;
//        changeVar(n);
        
    }
    
    public void changeVar(int x) {
            x += 10;
        }
}