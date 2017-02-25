package stone;


import javassist.gluonj.util.Loader;

/**
 * Created by Administrator on 2017/2/25 0025.
 */
public class Runner {
    public static void main(String[] args) throws Throwable {
        Loader.run(BasicInterpreter.class, args, BasicEvaluator.class);
    }
}
