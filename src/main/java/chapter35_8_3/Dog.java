package chapter35_8_3;

public class Dog {
    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Пёс " + name;
    }
}
