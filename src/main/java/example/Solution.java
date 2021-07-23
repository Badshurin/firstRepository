package example;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Ejevichka ejevichka = new Ejevichka("Marina", 27, 54);

        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, ejevichka);

        System.out.println(writer);

        Yagodka yagodka = new Yagodka("Marina", 27, 54);

        FileOutputStream fileOutputStream = new FileOutputStream("z:/ccc.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(yagodka);

        objectOutputStream.close();
        
    }
}

@JsonAutoDetect
@JsonPropertyOrder({"name", "weight", "age"})
class Ejevichka {
    private String name;
    private int age;
    private int weight;

    public Ejevichka(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @JsonProperty("YagodkaName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Yagodka implements Serializable {

    private static final long serialVersionUID = 30L;
    private String name;
    private int age;
    private int weight;

    public Yagodka(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Yagodka{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}