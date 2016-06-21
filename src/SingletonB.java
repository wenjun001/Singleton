/**
 * Created by xiu on 6/20/16.
 */
public class SingletonB {

    private volatile static SingletonB instance;

    private SingletonB() {}

    public static SingletonB getInstance() {
        if (instance == null) {
            synchronized (SingletonB.class) {
                if (instance == null) {
                    instance = new SingletonB();
                }
            }
        }
        return instance;
    }
}
