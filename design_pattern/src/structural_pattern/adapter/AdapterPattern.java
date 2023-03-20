package structural_pattern.adapter;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 适配器模式
 */
public class AdapterPattern {
    public static void main(String[] args) {
        // 创建一个不兼容的对象
        Adaptee adaptee = new AdapteeImp();

        // 使用适配器进行适配
        Target target = new Adapter(adaptee);

        // 调用目标接口的方法，实际上会调用到适配器的方法
        target.add(2, 3);
    }


    /**
     * 目标接口
     */
    interface Target {

        /**
         * 计算方法
         *
         * @param x
         * @param y
         */
        void add(int x, int y);
    }


    /**
     * 不兼容的接口
     */
    interface Adaptee {

        /**
         * 平方计算
         *
         * @param a
         */
        void square(int a);

    }

    /**
     * 不兼容的接口实现
     */
    static class AdapteeImp implements Adaptee {


        @Override
        public void square(int a) {
            System.out.println(a * a);
        }
    }

    /**
     * 适配器
     */
    static class Adapter implements Target {

        private Adaptee adaptee;

        public Adapter(Adaptee adaptee) {
            this.adaptee = adaptee;
        }


        @Override
        public void add(int x, int y) {
            adaptee.square(x);
        }
    }
}
