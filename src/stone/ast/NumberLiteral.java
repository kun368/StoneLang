package stone.ast;

import stone.Token;

/**
 * Created by Administrator on 2017/2/21 0021.
 */
public class NumberLiteral extends ASTLeaf {

    public NumberLiteral(Token token) {
        super(token);
    }

    public int value() {
        return getToken().getNumber();
    }
}
