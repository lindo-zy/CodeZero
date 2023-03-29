package behavioral_pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author poxiao
 * 命令模式：GUI的每个按钮都是命令；菜单点菜->服务员->厨师
 */
public class CommandPattern {
    public static void main(String[] args) {
        // 菜系 + 厨师；广东（粤菜）、山东（鲁菜）、四川（川菜）
        ICuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCook());
        ShanDongCuisine shanDongCuisine = new ShanDongCuisine(new ShanDongCook());
        SiChuanCuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());

        // 点单
        XiaoEr xiaoEr = new XiaoEr();

        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(shanDongCuisine);
        xiaoEr.order(siChuanCuisine);

        // 下单
        xiaoEr.placeOrder();
    }

    /**
     * 服务员，模拟点菜
     */
    static class XiaoEr {


        private List<ICuisine> cuisineList = new ArrayList<ICuisine>();

        public void order(ICuisine cuisine) {
            cuisineList.add(cuisine);
        }

        public synchronized void placeOrder() {
            for (ICuisine cuisine : cuisineList) {
                cuisine.cook();
            }
            cuisineList.clear();
        }

    }

    interface ICuisine {
        /**
         * 菜系
         */
        void cook();
    }

    interface ICook {
        /**
         * 做菜
         */
        void doCooking();
    }

    static class GuangDoneCuisine implements ICuisine {

        private ICook cook;

        public GuangDoneCuisine(ICook cook) {
            this.cook = cook;
        }

        @Override
        public void cook() {
            cook.doCooking();
        }

    }

    static class SiChuanCuisine implements ICuisine {

        private ICook cook;

        public SiChuanCuisine(ICook cook) {
            this.cook = cook;
        }

        @Override
        public void cook() {
            cook.doCooking();
        }

    }

    static class ShanDongCuisine implements ICuisine {

        private ICook cook;

        public ShanDongCuisine(ICook cook) {
            this.cook = cook;
        }

        @Override
        public void cook() {
            cook.doCooking();
        }

    }

    static class GuangDongCook implements ICook {

        @Override
        public void doCooking() {
            System.out.println("广东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
        }

    }

    static class SiChuanCook implements ICook {

        @Override
        public void doCooking() {
            System.out.println("四川厨师，烹饪川菜，中国最有特色的菜系，也是民间最大菜系。");
        }

    }

    static class ShanDongCook implements ICook {

        @Override
        public void doCooking() {
            System.out.println("山东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
        }

    }


}
