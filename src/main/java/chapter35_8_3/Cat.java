package chapter35_8_3;

public class Cat {
    protected String name;
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кот " + name;
    }
}
