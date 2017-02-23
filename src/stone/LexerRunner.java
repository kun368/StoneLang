package stone;

import stone.ast.ASTree;
import stone.ast.BasicParser;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public class LexerRunner {
    public static void main(String[] args) throws ParseException {
        Lexer lexer = new Lexer(new CodeDialog());
//        for (Token t; (t = lexer.read()) != Token.EOF; ) {
//            System.out.println("=>" + t.getText());
//        }
        BasicParser bp = new BasicParser();
        while (lexer.peek(0) != Token.EOF) {
            ASTree ast = bp.parse(lexer);
            System.out.println("=> " + ast.toString());
        }
    }
}
