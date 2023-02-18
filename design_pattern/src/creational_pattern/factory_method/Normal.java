package creational_pattern.factory_method;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 不用工厂模式的反例
 * 举例：比如我们要购买汽车，大众，丰田，特斯拉，分别生产：纯油车，混动车，电车；那我们就要创建3个汽车厂商，如果需要购买100个呢?
 */
public class Normal {
    public static void main(String[] args) {
        //从下面实例化可以看出，客户端需要具体类才能创建出具体对象，而且随着需要的对象增加，具体对象也要增加

        VolkswagenCar volkswagenCar = new VolkswagenCar();

        TeslaCar teslaCar = new TeslaCar();

        ToyotaCar toyotaCar = new ToyotaCar();

    }

    static class VolkswagenCar {

    }

    static class TeslaCar {

    }

    static class ToyotaCar {

    }

}
