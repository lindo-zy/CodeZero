package behavioral_pattern.strategy;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 策略模式：设计高德地图的步行、公共交通、自驾出行方法。
 */
public class StrategyPattern {

    public static void main(String[] args) {
        GaoDeTravel gaoDeTravel = new GaoDeTravel();
        gaoDeTravel.chooseTravelStrategy("步行", "成都", "重庆");
        gaoDeTravel.chooseTravelStrategy("自驾", "成都", "重庆");
//        成都到重庆,步行需要4小时！
//        成都到重庆,自驾需要1小时！
    }

    /**
     * 出行策略接口
     */
    public interface TravelStrategy {
        /**
         * 计算出行时间
         *
         * @param src
         * @param dst
         * @return
         */
        void calculateTravelTime(String src, String dst);
    }

    /**
     * 步行策略
     */
    static class ByWalk implements TravelStrategy {

        @Override
        public void calculateTravelTime(String src, String dst) {
            System.out.println(src + "到" + dst + ",步行需要4小时！");
        }
    }

    /**
     * 公共交通策略
     */
    static class ByBus implements TravelStrategy {

        @Override
        public void calculateTravelTime(String src, String dst) {
            System.out.println(src + "到" + dst + ",公交需要2小时！");
        }
    }

    /**
     * 自驾策略
     */
    static class ByCar implements TravelStrategy {

        @Override
        public void calculateTravelTime(String src, String dst) {
            System.out.println(src + "到" + dst + ",自驾需要1小时！");
        }
    }

    static class GaoDeTravel {

        public void chooseTravelStrategy(String strategy, String src, String dst) {
            if ("步行".equals(strategy)) {
                ByWalk byWalk = new ByWalk();
                byWalk.calculateTravelTime(src, dst);
            } else if ("公交".equals(strategy)) {
                ByBus byBus = new ByBus();
                byBus.calculateTravelTime(src, dst);
            } else if ("自驾".equals(strategy)) {
                ByCar byCar = new ByCar();
                byCar.calculateTravelTime(src, dst);
            }

        }
    }
}
