package structural_pattern.decorator;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 装饰器模式:给一个函数，添加日志记录。
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Cal cal = new SimpleCal();
        CalFunctionTimeDecorator decorator = new CalFunctionTimeDecorator(cal);
        decorator.factorialUsingRecursion(1000);
    }

    /**
     * 计算接口
     */
    interface Cal {
        /**
         * 求阶层函数
         *
         * @param n
         */
        int factorialUsingRecursion(int n);
    }

    /**
     * 计算类
     */
    static class SimpleCal implements Cal {

        @Override
        public int factorialUsingRecursion(int n) {
            if (n <= 2) {
                return n;
            }
            return n * factorialUsingRecursion(n - 1);
        }
    }

    /**
     * 计算类函数装饰器
     */
    static abstract class Decorator implements Cal {
        protected Cal calFunction;

        public Decorator(Cal calFunction) {
            this.calFunction = calFunction;
        }

        @Override
        public int factorialUsingRecursion(int n) {
            return calFunction.factorialUsingRecursion(n);
        }
    }

    static class CalFunctionTimeDecorator extends Decorator {

        public CalFunctionTimeDecorator(Cal calFunction) {
            super(calFunction);
        }

        @Override
        public int factorialUsingRecursion(int n) {
            //此处添加装饰
            System.out.println("factorialUsingRecursion函数参数:" + n);
            return super.factorialUsingRecursion(n);
        }
    }
}
