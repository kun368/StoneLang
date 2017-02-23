package stone.ast;

import stone.Token;

/**
 * Created by Administrator on 2017/2/21 0021.
 */
public class Name extends ASTLeaf {

    public Name(Token token) {
        super(token);
    }

    public String name() {
        return getToken().getText();
    }
}
