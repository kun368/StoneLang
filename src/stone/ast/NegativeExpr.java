package stone.ast;

import java.util.List;

/**
 * Created by Administrator on 2017/2/22 0022.
 */
public class NegativeExpr extends ASTList {

    public NegativeExpr(List<ASTree> children) {
        super(children);
    }

    public ASTree operand() {
        return child(0);
    }

    @Override
    public String toString() {
        return "-" + operand();
    }
}
