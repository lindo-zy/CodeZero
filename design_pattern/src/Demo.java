import java.lang.ref.PhantomReference;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 */
public class Demo {
    public static void main(String[] args) {
        int a = 1;
        Object obj = new Object();
//        PhantomReference<Object> pf = new PhantomReference<Object>(obj);
        PhantomReference<Object> pf = new PhantomReference<>(obj, null);
        obj = null;


    }
}
