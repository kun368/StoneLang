package stone.exception;

import stone.Token;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public class ParseException extends Exception {

    public ParseException(Token token) {
        this("", token);
    }

    public ParseException(String s) {
        super(s);
    }

    public ParseException(String msg, Token token) {
        super("syntax error around " + location(token) + ". " + msg);
    }

    public ParseException(IOException e) {
        super(e);
    }

    private static String location(Token token) {
        if (token == Token.EOF)
            return "the last line";
        else
            return "\"" + token.getText() + "\" at line" + token.getLineNumber();
    }
}
