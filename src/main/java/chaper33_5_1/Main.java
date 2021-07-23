package chaper33_5_1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.name = "Marsik";
        cat.age = 4;
        cat.weight = 4;

        Dog dog = new Dog();
        dog.name = "Maks";
        dog.age = 5;
        dog.owner = "Sister";

        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(cat);
        pets.add(dog);

        StringWriter writer = new StringWriter();
        convertToJSON(writer, pets);
        System.out.println(writer.toString());
    }

    public static void convertToJSON(StringWriter writer, Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, object);
    }
}
