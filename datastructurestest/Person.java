package datastructurestest;

/**
 *
 * @author Rachel
 */
public class Person {
    private Name personName;
    private int age;
    
    public Person() {}
    public Person(Name person, int theirAge) {
        personName = person;
        age = theirAge;
    }
    
    public Person(String first, String last, int a) {
        personName.setFirstName(first);
        personName.setLastName(last);
        age = a;
    }
    
    public void setName(Name n) {
        personName = n;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int a) {
        age = a;
    }
    
    public Name getName() {
        return personName;
    }
    
    public boolean equals(Person p) {
        boolean isaMatch = false;
        if (this.age == p.getAge()) {
            Name x = getName();
            Name y = p.getName();
            if (x.getLastName().matches(y.getLastName())) {
                if (x.getFirstName().matches(y.getFirstName())) {
                    isaMatch = true;
                }
            }
        } 
            return isaMatch;
    }
    
    public boolean isOlder(Person a) {
        boolean isaOlder = false;
        
        if (this.age > a.getAge()) {
            isaOlder = true;
        }
        
        return isaOlder;
    }
    
    @Override
    public String toString() {
        String s = "\n" + personName.getLastName() + ", " + 
                personName.getFirstName() + "\t" + age;
        return s;
    }
    
    public static void main(String[] args) {
        Person me = new Person();
        Name nameb = new Name();
        if (args.length < 3) {
            System.out.println("Incorrect number of arguments.");
        } else {
            nameb.setLastName(args[0]);
            nameb.setFirstName(args[1]);
            int a = Integer.parseInt(args[2]);          
            me.setAge(a);
            me.setName(nameb);
        }
        System.out.println(me.toString());
        
        Name jeff = new Name("Jeffrey", "Hunt");
        Person you = new Person(jeff, 31);
        
        Name dupe = new Name("Jeffrey", "Hunt");
        Person b = new Person(dupe, 31);
        
        System.out.println(you.toString());
        if ( me.equals(you)) {
            System.out.println("We are equal.");
        } else {
            System.out.println("We are not equal.");
        }
        
        System.out.println(b.toString());
        if ( you.equals(b)) {
            System.out.println("We are equal.");
        } else {
            System.out.println("We are not equal.");
        }
        
        if (you.isOlder(me)) {
            System.out.println("Jeff is older than you.");
        } else {
            System.out.println("Jeff is not older than you.");
        }
        
    }
    
}