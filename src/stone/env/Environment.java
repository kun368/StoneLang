package stone.env;

/**
 * Created by Administrator on 2017/2/25 0025.
 */
public interface Environment {
    void put(String name, Object value);

    Object get(String name);
}
