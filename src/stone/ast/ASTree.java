package stone.ast;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/2/21 0021.
 */
public abstract class ASTree implements Iterable<ASTree> {

    public abstract ASTree child(int i);

    public abstract int numChildren();

    public abstract Iterator<ASTree> children();

    public abstract String location();

    @Override
    public Iterator<ASTree> iterator() {
        return children();
    }
}
