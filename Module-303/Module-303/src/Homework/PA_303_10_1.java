package Homework;

// Abstract class Monster
abstract class Monster {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by all subclasses
    public abstract String attack();
}

// Subclass FireMonster
class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}

// Subclass WaterMonster
class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }
}

// Subclass StoneMonster
class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}

// Main class to test polymorphism
public class PA_303_10_1 {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("r2u2");   // upcast
        Monster m2 = new WaterMonster("u2r2");  // upcast
        Monster m3 = new StoneMonster("r2r2");  // upcast

        // Invoke the actual implementation
        System.out.println(m1.attack());  // Run FireMonster's attack
        System.out.println(m2.attack());  // Run WaterMonster's attack
        System.out.println(m3.attack());  // Run StoneMonster's attack

        // m1 dies, replace it with a StoneMonster
        m1 = new StoneMonster("a2b2");  // upcast
        System.out.println(m1.attack());  // Run new StoneMonster's attack

        // Monster m4 = new Monster("u2u2");  // Uncommenting this will cause a compilation error because Monster is abstract
        // System.out.println(m4.attack());  // Attempting to attack with an abstract Monster will not work
    }
}

