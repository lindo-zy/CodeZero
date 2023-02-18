## 23种设计模式

### 前言：

设计模式作为编程应用的最佳实践，提供了很多在代码开发中遇到问题的常用解决方案，列如：当一个需要记录一个函数的运行时间，但是又不想在原有函数里面修改，那么装饰器模式就能派上用场；用户身份校验，有多个校验条件，如果满足继续校验下一个，否则就返回，那么可以用责任链模式。不过，由于设计模式比较枯燥难懂，加上平时工作中，为了应付业务需求，实际用到的设计模式很少，如果没有几年的编程经验，对设计模式理解属于云里雾里，很难实际应用。所以让再次学习一次设计模式，帮助我们提高程序设计，提升编程思维能力！

#### 运行环境：

代码直接复制粘贴即可运行调试！

java版本：JDK1.8

python版本：python3.8+



设计模式之间的关系图：

![设计模式之间的关系](E:\github_space\CodeZero\design_pattern\README.assets\the-relationship-between-design-patterns.jpg)

参考：https://www.runoob.com/design-pattern/design-pattern-intro.html



## 创建型模式（creational pattern）

### 工厂模式（Factory Method）难度：2星

参考：https://refactoringguru.cn/design-patterns/factory-method

参考：http://shusheng007.top/2020/02/16/010/

![1676705713436](E:\github_space\CodeZero\design_pattern\README.assets\1676705713436.png)

工厂模式：创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。

##### 使用场景：

当你需要**new**一个类的对象的时候：

1. 你不想直接**new**这个类的对象，怕以后这个类改变的时候你需要回来改代码，而此时依赖这个类的地方已经到处都是了。
2. 这个类的对象构建过程非常复杂，你不愿意将这么复杂的构建过程一遍又一遍的写在需要用到此对象的地方。
3. 这个类的对象在构建过程中依赖了很多其他的类，而你无法在调用的地方提供。



##### UML图：

![工厂方法模式结构](E:\github_space\CodeZero\design_pattern\README.assets\structure.png)



##### 需求描述：

富士康接了小米和苹果的笔记本生产，需要分别建立小米和苹果工厂，用于生产笔记本电脑。

产品：笔记本电脑

具体产品：小米笔记本、苹果笔记本

工厂：电脑工厂

具体工厂：小米工厂、苹果工厂



##### java代码：

```java
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

```



#### 总结：

这是一个需要熟练掌握的设计模式，在平时需求中，需要创建一类复杂类时就可以用上。