package com.zzkun;

import com.zzkun.exception.StoneException;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public abstract class Token {

    public static final Token EOF = new Token(-1) {
    };

    public static final String EOL = "\\n";

    private int lineNumber;

    protected Token(int line) {
        this.lineNumber = line;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public boolean isNumber() {
        return false;
    }

    public boolean isIdentifier() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public int getNumber() {
        throw new StoneException("no number token");
    }

    public String getText() {
        return "";
    }
}
