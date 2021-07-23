package chapter33_5_5;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class RealBean {
    protected final int id;
    protected final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalMap() {
        return additionalMap;
    }

    @JsonAnySetter
    public void setAdditionalMap(Map<String, Object> additionalMap) {
        this.additionalMap = additionalMap;
    }

    protected Map<String, Object> additionalMap = new HashMap<String, Object>();

    public RealBean(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
