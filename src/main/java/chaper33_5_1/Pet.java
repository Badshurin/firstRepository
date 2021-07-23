package chaper33_5_1;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
//@JsonSubTypes.Type({
//        @JsonSubTypes.Type(value = chaper33_5_1.Cat.class, name = "cat"),
//        @JsonSubTypes.Type(value = chaper33_5_1.Dog.class, name = "dog")
//})

@JsonAutoDetect
class Pet {
    public String name;

    public Pet() {
    }
}

@JsonAutoDetect
class Dog extends Pet{
    public int age;
    public String owner;

    public Dog() {
    }
}

@JsonAutoDetect
class Cat extends Pet{
    public int age;
    public int weight;

    public Cat() {
    }

}
