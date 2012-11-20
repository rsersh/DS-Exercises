package datastructurestest;

/**
 *
 * @author Rachel
 */
public class Name {
    String lastname;
    String firstname;
    
    public Name(String first, String last) {
        firstname = first;
        lastname = last;
    }
    
    public Name(Name aName) {
        firstname = aName.getFirstName();
        lastname = aName.getLastName();
    }
    
    public Name() {
        lastname = null;
        firstname = null;
    }
     
    
    public String getFirstName() {
        return firstname;
    }
    
    public String getLastName() {
        return lastname;
    }
    
    public void setFirstName(String first) {
        firstname = first;
    }
    
    public void setLastName(String last) {
        lastname = last;
    }
    
    public void setName(String first, String last) {
        setFirstName(first);
        setLastName(last);
    }
    public void setName(Name aName) {
        this.setFirstName(aName.getFirstName());
        this.setLastName(aName.getLastName());
    }
    public void giveLastNameTo(Name child) {
        //child.setLastName(this.lastname);
        child.setLastName(lastname);
    }
    
    public Name readName() {        
        String first = getFirstName();
        String last = getLastName();
        Name aName = new Name(first, last);
        return aName;
    }
    
    
    @Override
    public String toString() {
        return lastname + ", " + firstname;
    }
    
    public static void main(String[] args) {
        Name jack = new Name("Jack", "Smith");
        System.out.println(jack.toString());
        Name jeff = new Name("Jeff", "Hunt");
        Name friend = jeff;
        System.out.println(friend);

        boolean result;
        String s = "";
        result = (friend == jeff);
        System.out.println(s + result);
        //System.out.printf("%s\n", jeff.toString());
        Name rach = new Name();
        rach.setFirstName("Rachel");
        jeff.giveLastNameTo(rach);
        System.out.println(rach.toString());        
    }
}
