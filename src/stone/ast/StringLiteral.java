package stone.ast;

import stone.Token;

/**
 * Created by Administrator on 2017/2/22 0022.
 */
public class StringLiteral extends ASTLeaf {

    public StringLiteral(Token token) {
        super(token);
    }

    public String value() {
        return getToken().getText();
    }
}
