package stone.ast;

import java.util.List;

/**
 * Created by Administrator on 2017/2/22 0022.
 */
public class PrimaryExpr extends ASTList {

    public PrimaryExpr(List<ASTree> children) {
        super(children);
    }

    public static ASTree create(List<ASTree> c) {
        return c.size() == 1 ? c.get(0) : new PrimaryExpr(c);
    }

}
