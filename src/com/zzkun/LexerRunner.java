package com.zzkun;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public class LexerRunner {
    public static void main(String[] args) throws ParseException {
        Lexer lexer = new Lexer(new CodeDialog());
        for (Token t; (t = lexer.read()) != Token.EOF; ) {
            System.out.println("=>" + t.getText());
        }
    }
}
