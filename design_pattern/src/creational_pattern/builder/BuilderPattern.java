package creational_pattern.builder;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * * 肯德基疯狂星期四：V我50，马上上车。提供多个套餐组合：但是必选汉堡和可乐，其余可以搭配：薯条、炸鸡、烤翅。
 * * 里面又细分为，汉堡：奥尔良、脆皮鸡排；可乐：大杯、小杯；薯条：大薯、小薯；炸鸡：大份、小份；烤翅：单个、一对。
 * 如果我们有5类套餐
 * 套餐1：只有汉堡和可乐
 * 套餐2：汉堡、可乐、薯条
 * 套餐3：汉堡、可乐、薯条、炸鸡
 * 套餐4：汉堡、可乐、薯条、炸鸡、鸡翅
 * 套餐5：汉堡、可乐、鸡翅
 */
public class BuilderPattern {
    public static void main(String[] args) {

        //套餐1
        CrayKfc crayKfc1 = new CrazyKfcBuilder(new Hamburger("奥尔良"), new Cola("可口")).build();
        System.out.println("--------------");
        //套餐4
        CrayKfc crayKfc4 = new CrazyKfcBuilder(new Hamburger("鸡排"), new Cola("百事")
        ).setFrenchFries(new FrenchFries("大薯")).setFriedChicken(new FriedChicken("小份")
        ).setWings(new Wings("一对")).build();

        //可以看出，我们使用CrazyKfcBuilder的链式调用，很优雅的就可以灵活的添加需要构造的方法


    }

    /**
     * 疯狂星期四类
     */
    static class CrayKfc {
        private final Hamburger hamburger;//汉堡，必须
        private final Cola cola;//可乐,必选
        private final FrenchFries frenchFries;//薯条，可选
        private final FriedChicken friedChicken;//炸鸡，可选
        private final Wings wings;//鸡翅；可选

        //此时，构造者来进行构造
        private CrayKfc(CrazyKfcBuilder crazyKfcBuilder) {
            this.hamburger = crazyKfcBuilder.hamburger;
            this.cola = crazyKfcBuilder.cola;
            this.frenchFries = crazyKfcBuilder.frenchFries;
            this.friedChicken = crazyKfcBuilder.friedChicken;
            this.wings = crazyKfcBuilder.wings;

        }

    }

    /**
     * 汉堡类
     */
    static class Hamburger {

        public Hamburger(String name) {
            if ("奥尔良".equals(name)) {
                orleansHamburg();
            }
            if ("鸡排".equals(name)) {
                chickenSteakHamburger();
            }
        }

        public void orleansHamburg() {
            System.out.println("奥尔良汉堡！");
        }

        public void chickenSteakHamburger() {
            System.out.println("鸡排汉堡！");
        }
    }

    /**
     * 可乐类
     */
    static class Cola {

        public Cola(String name) {
            if ("百事".equals(name)) {
                pepsiCola();
            }
            if ("可口".equals(name)) {
                cocaCola();
            }
        }

        public void pepsiCola() {
            System.out.println("百事可乐！");
        }

        public void cocaCola() {
            System.out.println("可口可乐！");
        }
    }

    /**
     * 薯条类
     */
    static class FrenchFries {
        public FrenchFries(String name) {
            if ("大薯".equals(name)) {
                bigFrenchFries();
            }
            if ("小薯".equals(name)) {
                smallFrenchFries();
            }
        }

        public void bigFrenchFries() {
            System.out.println("大薯！");
        }

        public void smallFrenchFries() {
            System.out.println("小薯！");
        }
    }

    /**
     * 炸鸡类
     */
    static class FriedChicken {

        public FriedChicken(String name) {
            if ("大份".equals(name)) {
                largeFriedChicken();
            }
            if ("小份".equals(name)) {
                smallFriedChicken();
            }
        }

        public void largeFriedChicken() {
            System.out.println("大份炸鸡！");
        }

        public void smallFriedChicken() {
            System.out.println("小份炸鸡！");
        }
    }

    /**
     * 烤翅类
     */
    static class Wings {

        public Wings(String name) {
            if ("单个".equals(name)) {
                singleWings();
            }
            if ("一对".equals(name)) {
                doubleWings();

            }
        }

        public void singleWings() {
            System.out.println("单个烤翅！");
        }

        public void doubleWings() {
            System.out.println("一对烤翅！");
        }
    }


    /**
     * 疯狂星期四构造者
     */
    static class CrazyKfcBuilder {
        private Hamburger hamburger;//汉堡，必须
        private Cola cola;//可乐,必选
        private FrenchFries frenchFries;//薯条，可选
        private FriedChicken friedChicken;//炸鸡，可选
        private Wings wings;//鸡翅；可选


        public CrazyKfcBuilder(Hamburger hamburger, Cola cola) {
            this.hamburger = hamburger;
            this.cola = cola;
        }

        //建造方法
        public CrayKfc build() {
            return new CrayKfc(this);
        }


        public FrenchFries getFrenchFries() {
            return frenchFries;
        }

        //set方法返回this,用于链式调用
        public CrazyKfcBuilder setFrenchFries(FrenchFries frenchFries) {
            this.frenchFries = frenchFries;
            return this;
        }

        public FriedChicken getFriedChicken() {
            return friedChicken;
        }

        public CrazyKfcBuilder setFriedChicken(FriedChicken friedChicken) {
            this.friedChicken = friedChicken;
            return this;
        }

        public Wings getWings() {
            return wings;
        }

        public CrazyKfcBuilder setWings(Wings wings) {
            this.wings = wings;
            return this;
        }
    }

}
