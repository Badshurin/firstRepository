package chapter35_8_3;

public class Puppy extends Dog{

    public Puppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Щенок " + name;
    }
}
