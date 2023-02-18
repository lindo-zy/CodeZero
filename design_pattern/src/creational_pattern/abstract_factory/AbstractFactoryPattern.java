package creational_pattern.abstract_factory;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 抽象工厂模式
 * 需求：比如我们要购买汽车，大众，丰田，特斯拉都生产轿车；
 * 但是，有一天他们都可以生产suv了，他们厂也要支持他们生产suv
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        // 大众工厂生产大众的产品
        AbstractFactory volkswagen = new VolkswagenFactory();
        volkswagen.makeSedan().sale();
        volkswagen.makeSuv().sale();

        // 特斯拉工厂生产特斯拉产品
        AbstractFactory tesla = new TeslaFactory();
        tesla.makeSedan().sale();
        tesla.makeSuv().sale();

        // 丰田工厂生产丰田产品
        AbstractFactory toyota = new ToyotaFactory();
        toyota.makeSedan().sale();
        toyota.makeSuv().sale();

        //这里可以看出，这是一个产品族的概念，就是一个厂的不同产品放到一个厂来生产管理

    }

    /**
     * 轿车产品接口
     */
    interface SedanCar {
        /**
         * 轿车产品方法
         */
        void sale();
    }

    /**
     * 大众轿车产品
     */
    static class VolkswagenSedanCar implements SedanCar {

        @Override
        public void sale() {
            System.out.println("大众汽车：轿车！");
        }
    }

    /**
     * 特斯拉轿车产品
     */
    static class TeslaSedanCar implements SedanCar {

        @Override
        public void sale() {
            System.out.println("特斯拉汽车：轿车！");
        }
    }

    /**
     * 丰田轿车产品
     */
    static class ToyotaSedanCar implements SedanCar {

        @Override
        public void sale() {
            System.out.println("丰田汽车：轿车！");
        }
    }

    /**
     * SUV产品接口
     */
    interface SuvCar {
        /**
         * SUV产品方法
         */
        void sale();
    }

    /**
     * 大众SUV产品
     */
    static class VolkswagenSuvCar implements SuvCar {

        @Override
        public void sale() {
            System.out.println("大众汽车：SUV！");
        }
    }

    /**
     * 特斯拉SUV产品
     */
    static class TeslaSuvCar implements SuvCar {

        @Override
        public void sale() {
            System.out.println("特斯拉：SUV！");
        }
    }

    /**
     * 丰田SUV产品
     */
    static class ToyotaSuvCar implements SuvCar {

        @Override
        public void sale() {
            System.out.println("丰田汽车：SUV！");
        }
    }

    /**
     * 工厂接口
     */
    interface AbstractFactory {
        /**
         * 轿车产品工厂方法
         *
         * @retrun 轿车实例
         */
        SedanCar makeSedan();

        /**
         * suv产品工厂方法
         *
         * @retrun suv实例
         */
        SuvCar makeSuv();
    }

    /**
     * 大众汽车工厂
     */
    static class VolkswagenFactory implements AbstractFactory {

        @Override
        public SedanCar makeSedan() {
            return new VolkswagenSedanCar();
        }

        @Override
        public SuvCar makeSuv() {
            return new VolkswagenSuvCar();
        }
    }

    /**
     * 特斯拉汽车工厂
     */
    static class TeslaFactory implements AbstractFactory {

        @Override
        public SedanCar makeSedan() {
            return new TeslaSedanCar();
        }

        @Override
        public SuvCar makeSuv() {
            return new TeslaSuvCar();
        }
    }

    /**
     * 丰田汽车工厂
     */
    static class ToyotaFactory implements AbstractFactory {

        @Override
        public SedanCar makeSedan() {
            return new ToyotaSedanCar();
        }

        @Override
        public SuvCar makeSuv() {
            return new ToyotaSuvCar();
        }
    }

}
