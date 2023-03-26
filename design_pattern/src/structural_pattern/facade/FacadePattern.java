package structural_pattern.facade;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 外观模式:客户到在手机商城购买商品。
 * 子系统：下单、支付、物流
 * 外观：购物操作接口
 */
public class FacadePattern {
    public static void main(String[] args) {
        //对客户端就看到这个类
        ShoppingFacade shoppingFacade = new ShoppingFacade();

        shoppingFacade.shopping();

    }

    /**
     * 下单系统
     */
    static class OrderSystem {

        /**
         * 获取订单号
         *
         * @param orderName
         * @return
         */
        public void getOrder(String orderName) {
            System.out.println("订单：" + orderName);
        }

    }

    /**
     * 支付系统
     */
    static class PaySystem {
        public void getPay(int payNum) {
            System.out.println("支付金额：" + payNum);
        }

    }

    /**
     * 物流系统
     */
    static class LogisticsSystem {
        /**
         * 获取物流信息
         *
         * @param logisticsInfo
         * @return
         */
        public void getLogistics(String logisticsInfo) {
            System.out.println("商品物流信息：" + logisticsInfo);
        }

    }


    /**
     * 购物外观类
     */
    static class ShoppingFacade {
        public void shopping() {
            //引入子模块，就是外观模式
            OrderSystem orderSystem = new OrderSystem();
            PaySystem paySystem = new PaySystem();
            LogisticsSystem logisticsSystem = new LogisticsSystem();

            orderSystem.getOrder("iphone 20 pro");
            paySystem.getPay(200);
            logisticsSystem.getLogistics("已发货");
        }

    }

}
