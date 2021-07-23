package chapter33_5_3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        T t = mapper.readValue(fileName, clazz);
        return t;
    }
}
