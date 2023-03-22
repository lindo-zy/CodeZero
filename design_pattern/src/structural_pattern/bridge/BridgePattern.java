package structural_pattern.bridge;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 桥接模式:奶茶分为，小杯，中杯，大杯；根据甜度，又分为，五分糖，七分糖，全糖。
 * 后续如果添加了，超大杯，只需要添加一个杯子相关类即可
 */
public class BridgePattern {
    public static void main(String[] args) {

        RefinedMilkTea largeMilkTea = new LargeMilkTea(new FullSugar());
        largeMilkTea.orderMilkTea();

        RefinedMilkTea smallMilkTea = new SmallMilkTea(new HalfSugar());
        smallMilkTea.orderMilkTea();

        //全糖！
        //大杯奶茶！
        //半糖！
        //小杯奶茶！
    }


    /**
     * 糖分量的实现化接口
     */
    interface SugarImplementor {
        /**
         * 加糖操作
         */
        void addSugar();
    }


    /**
     * 抽象化部分
     */
    static abstract class MilkTea {
        //此处进行桥接
        protected SugarImplementor sugarImplementor;

        public MilkTea(SugarImplementor sugarImplementor) {
            this.sugarImplementor = sugarImplementor;
        }

        /**
         * 点奶茶
         */
        public abstract void orderMilkTea();
    }


    /**
     * 精确抽象化部分
     */
    static abstract class RefinedMilkTea extends MilkTea {
        public RefinedMilkTea(SugarImplementor sugarImplementor) {
            super(sugarImplementor);
            sugarImplementor.addSugar();
        }
        //可以在这里添加其他方法

    }

    //具体实现化实现

    static class HalfSugar implements SugarImplementor {

        @Override
        public void addSugar() {
            System.out.println("半糖！");
        }
    }

    static class LessSugar implements SugarImplementor {

        @Override
        public void addSugar() {
            System.out.println("七分糖！");
        }
    }

    static class FullSugar implements SugarImplementor {

        @Override
        public void addSugar() {
            System.out.println("全糖！");
        }
    }

    //具体抽象化实现

    static class LargeMilkTea extends RefinedMilkTea {

        public LargeMilkTea(SugarImplementor sugarImplementor) {
            super(sugarImplementor);
        }

        @Override
        public void orderMilkTea() {
            System.out.println("大杯奶茶！");
        }
    }

    static class MidMilkTea extends RefinedMilkTea {

        public MidMilkTea(SugarImplementor sugarImplementor) {
            super(sugarImplementor);
        }

        @Override
        public void orderMilkTea() {
            System.out.println("小杯奶茶！");
        }
    }

    static class SmallMilkTea extends RefinedMilkTea {

        public SmallMilkTea(SugarImplementor sugarImplementor) {
            super(sugarImplementor);
        }

        @Override
        public void orderMilkTea() {
            System.out.println("小杯奶茶！");
        }
    }


}
