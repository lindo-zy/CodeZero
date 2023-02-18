package creational_pattern.abstract_factory;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 抽象工厂模式反例
 * 需求：比如我们要购买汽车，大众，丰田，特斯拉都生产轿车；
 * 但是，有一天他们都可以生产suv了，我们也要支持他们生产suv
 */
public class Normal {
    public static void main(String[] args) {
        // 从下面实例化可以看出，客户端需要具体类才能创建出具体对象，而且随着需要的对象增加，具体对象也要增加
        VolkswagenCar volkswagenCar = new VolkswagenCar();

        TeslaCar teslaCar = new TeslaCar();

        ToyotaCar toyotaCar = new ToyotaCar();

    }

    static class VolkswagenCar {

        public void sedan() {
        }

        ;

        public void suv() {
        }

        ;

    }

    static class TeslaCar {
        public void sedan() {
        }

        ;

        public void suv() {
        }

        ;
    }

    static class ToyotaCar {
        public void sedan() {
        }

        ;

        public void suv() {
        }

        ;
    }
}
