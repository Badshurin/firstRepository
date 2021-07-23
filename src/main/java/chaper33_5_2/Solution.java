package chaper33_5_2;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

public class Solution {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.name = "Marsik";
        cat.age = 4;
        cat.weight = 5;

        StringWriter writer = new StringWriter();
        convertToJson(writer, cat);
        System.out.println(writer.toString());
    }

    public static void convertToJson(StringWriter writer, Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, object);
    }
}

@JsonAutoDetect
class Cat {
    @JsonProperty("wildAnimal")
    public String name;
    @JsonIgnore
    public int age;
    @JsonProperty("over")
    public int weight;

    public Cat() {

    }
}