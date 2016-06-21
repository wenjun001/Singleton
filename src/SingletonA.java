/**
 * Created by xiu on 6/20/16.
 */
public class SingletonA {
    private static final SingletonA INSTANCE = new SingletonA();

    private SingletonA() {}

    public static SingletonA getInstance() {
        return INSTANCE;
    }
}
