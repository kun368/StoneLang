package stone.env;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/2/25 0025.
 */
public class BasicEnv implements Environment {

    protected HashMap<String, Object> values;

    public BasicEnv() {
        this.values = new HashMap<>();
    }

    @Override
    public void put(String name, Object value) {
        values.put(name, value);
    }

    @Override
    public Object get(String name) {
        return values.get(name);
    }
}
