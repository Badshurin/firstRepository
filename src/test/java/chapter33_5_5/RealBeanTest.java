package chapter33_5_5;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RealBeanTest {

    @Test
    public void testRealBeanTest() throws JsonProcessingException {
        RealBean realBean = new RealBean(1, "Alex");
        String jsonString = new ObjectMapper().writeValueAsString(realBean);
        System.out.println(jsonString);
    }
}