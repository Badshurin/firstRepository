package chapter35_8_3;

public class Kitten extends Cat{
    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Котёнок " + name;
    }
}
