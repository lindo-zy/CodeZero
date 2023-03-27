package structural_pattern.proxy;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 代理模式：设计一个每秒钟只能访问10次的接口，超过次数拒绝访问。
 */
public class ProxyPattern {
    public static void main(String[] args) {
        ServiceInterface proxy = new Proxy(new RealService());
        for (int i = 0; i < 11; i++) {
            proxy.request();
        }

    }

    /**
     * 服务接口
     */
    interface ServiceInterface {

        /**
         * 请求方法
         */
        void request();
    }

    /**
     * 具体实现类
     */
    static class RealService implements ServiceInterface {

        @Override
        public void request() {
            System.out.println("访问接口成功！");
        }
    }

    static class Proxy implements ServiceInterface {
        private int callCount = 0;
        private long lastCallTime = System.currentTimeMillis();
        private ServiceInterface realService;

        public Proxy(ServiceInterface realService) {
            this.realService = realService;
        }

        @Override
        public void request() {

            // 检查距离上次调用时间是否超过1分钟,是否超过10次调用限制
            long currentTime = System.currentTimeMillis();
            if (callCount >= 10 && currentTime - lastCallTime <= 1000) {
                System.out.println("请求过于频繁，请稍后重试！");
                return;
            }

            //更新调用次数和上次调用时间
            callCount++;
            lastCallTime = currentTime;

            // 调用真正的函数
            realService.request();
        }
    }
}
