package chapter33_5_4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

public class Solution {
    public static void main(String[] args) throws IOException {
        First f = (First) convertOneToAnother(new Second(), First.class);
        Second s = (Second) convertOneToAnother(new First(), Second.class);
    }

    public static Object convertOneToAnother(Object one, Class resoltClassObject) throws IOException {
        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, one);
        String newObject = writer.toString();
        return mapper.readValue(newObject, resoltClassObject);


    }


    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "className")
    @JsonSubTypes(@JsonSubTypes.Type(value=First.class, name = "first"))
    public static class First {
        public String name;
        public int cool;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "className")
    @JsonSubTypes(@JsonSubTypes.Type(value = Second.class, name = "second"))
    public static class Second {
        public String name;
        public int cool;
    }
}
