package stone.exception;

import stone.ast.ASTree;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public class StoneException extends RuntimeException {

    public StoneException(String message) {
        super(message);
    }

    public StoneException(String m, ASTree t) {
        super(m + " " + t.location());
    }


}
