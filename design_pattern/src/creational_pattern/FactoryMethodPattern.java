package creational_pattern;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 工厂方法
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        //生产Mac电脑
        ComputerFactory macFactory = new MacComputerFactory();
        macFactory.makeComputer().setOperationSystem();

        //生产小米电脑
        ComputerFactory miFactory = new MiComputerFactory();
        miFactory.makeComputer().setOperationSystem();
    }

    /**
     * 定义电脑的抽象基类
     */
    static abstract class Computer {
        /**
         * 设置操作系统
         */
        public abstract void setOperationSystem();
    }

    /**
     * 实现苹果电脑类
     */
    static class MacComputer extends Computer {

        @Override
        public void setOperationSystem() {
            System.out.println("Mac电脑安装Mac系统！");
        }
    }

    /**
     * 实现小米电脑类
     */
    static class MiComputer extends Computer {

        @Override
        public void setOperationSystem() {
            System.out.println("小米电脑安装windows系统！");
        }
    }

    /**
     * 定义工厂接口
     */
    interface ComputerFactory {
        /**
         * 生产电脑
         *
         * @return
         */
        Computer makeComputer();
    }

    /**
     * 苹果电脑工厂
     */
    static class MacComputerFactory implements ComputerFactory {

        @Override
        public Computer makeComputer() {
            return new MacComputer();
        }
    }

    /**
     * 小米电脑工厂
     */
    static class MiComputerFactory implements ComputerFactory {

        @Override
        public Computer makeComputer() {
            return new MiComputer();
        }
    }
}
