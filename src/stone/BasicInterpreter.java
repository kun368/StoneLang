package stone;

import stone.ast.ASTree;
import stone.ast.BasicParser;
import stone.ast.NullStmnt;
import stone.env.BasicEnv;
import stone.env.Environment;
import stone.exception.ParseException;

/**
 * Created by Administrator on 2017/2/25 0025.
 */
public class BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new BasicParser(), new BasicEnv());
    }

    public static void run(BasicParser bp, Environment env)
            throws ParseException {
        Lexer lexer = new Lexer(new CodeDialog());
        while (lexer.peek(0) != Token.EOF) {
            ASTree t = bp.parse(lexer);
            if (!(t instanceof NullStmnt)) {
                Object r = ((BasicEvaluator.ASTreeEx) t).eval(env);
                System.out.println("=> " + r);
            }
        }
    }
}
