package creational_pattern.factory_method;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 工厂方法
 * 需求：比如我们要购买汽车，大众，丰田，特斯拉，分别生产：纯油车，混动车，电车；那我们就要创建3个汽车厂商，如果需要购买100个呢?
 * 如果有一个工厂支持生产对应的汽车，那我们可以直接通过这个工厂就可以买到车
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        //从同一个工厂就可以获取到不同的车厂
        Factory volkswagen = new VolkswagenFactory();
        volkswagen.makeCar().sale();

        Factory tesla = new TeslaFactory();
        tesla.makeCar().sale();

        Factory toyota = new ToyotaFactory();
        toyota.makeCar().sale();

        //缺点也很明显，方便了客户，苦了自己，如果需要新增比亚迪汽车，那我们不仅要实现比亚迪产品类，还要添加比亚迪工厂类

    }

    /**
     * 产品接口
     */
    interface Car {
        /**
         * 产品方法
         */
        void sale();
    }

    /**
     * 具体产品：大众汽车
     */
    static class VolkswagenCar implements Car {

        @Override
        public void sale() {
            System.out.println("大众汽车：纯油车！");

        }
    }

    /**
     * 具体产品：特斯拉汽车
     */
    static class TeslaCar implements Car {

        @Override
        public void sale() {
            System.out.println("特斯拉汽车：电动车！");
        }
    }

    /**
     * 具体产品：丰田汽车
     */
    static class ToyotaCar implements Car {

        @Override
        public void sale() {
            System.out.println("丰田汽车：混动车！");

        }
    }

    /**
     * 工厂接口
     */
    interface Factory {

        /**
         * 工厂方法
         *
         * @return 产品实例
         */
        Car makeCar();
    }

    /**
     * 大众汽车工厂
     */
    static class VolkswagenFactory implements Factory {

        @Override
        public Car makeCar() {
            return new VolkswagenCar();
        }
    }

    /**
     * 特斯拉工厂
     */
    static class TeslaFactory implements Factory {

        @Override
        public Car makeCar() {
            return new TeslaCar();
        }
    }

    /**
     * 丰田工厂
     */
    static class ToyotaFactory implements Factory {

        @Override
        public Car makeCar() {
            return new ToyotaCar();
        }
    }


}
