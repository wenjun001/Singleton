/**
 * Created by xiu on 6/20/16.
 */
public class SingletonC {
    enum Single{
        INSTANCE;
        SingletonC s=new SingletonC();
        public SingletonC getInstance(){
            if(s==null)
                return new SingletonC();
            else return s;
        }
    }

}
