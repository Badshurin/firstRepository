package chapter33_5_5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        RealBean realBean = new RealBean(1, "a");
        Map <String, Object> map = new HashMap <String, Object> ();
        map.put("one", 1);
        realBean.setAdditionalMap((Map<String, Object>) new HashMap<String, Object>().put("one",1));
        mapper.writeValue(writer,realBean);
        System.out.println(writer.toString());
        System.out.println(realBean.getAdditionalMap().toString());
    }
}
