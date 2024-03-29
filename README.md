# CodeZero

前言：从0到1，一步一步迈向架构师之路

[TOC]

## 简介

1.本项目代码都可以直接复制粘贴，即可运行调试，所以某些规范未严格遵守，主要是学习思路和方法

2.由于本人水平学识有限，内容可能有误，希望大家帮忙指出，我及时改正，感谢大家

------

## 1.设计模式学习系列

**相关参考**：

https://refactoringguru.cn/design-patterns  带有主流语言的设计模式讲解

https://www.runoob.com/design-pattern/proxy-pattern.html 菜鸟教程的设计模式

https://github.com/shusheng007/design-patterns  秒懂设计模式系列

前言：SOLID六大原则+23种设计模式，几乎是每个程序员必学必会的内容，经典永流传，值得反复品味。

### 六大设计原则：

**单一职责原则（SRP）**

简单概括：一个类或者方法，职责尽量单一。用尽量简单的代码完成对应的功能即可，无需添加花里胡哨的东西。

**开放封闭原则（OCP)**

简单概括：对扩展开放，对修改关闭。添加新功能时，不要修改老功能，不能影响老代码。

**里氏替换原则（LSP）**

简单概括：一个子类实例在任何时刻都可以替换父类实例，从而形成IS-A关系。父类出现的地方，替换成子类，程序照样正常运行，要求子类不要重写父类已实现的方法。

**接口隔离原则（ISP）**

简单概括：实现类不应该依赖不需要的接口方法，采用多个专用的接口来替换单个复杂的总接口。接口职责划分单一。

**依赖倒置原则（DIP）**

简单概括：高层模块不应该依赖于底层模块，二者都应该依赖于抽象；抽象不应该依赖于细节，细节应该依赖于抽象。面向接口编程，不要面向实现编程。

**迪米特法则（LOD）**

简答概括：一个对象应该对其他对象有最少的了解，不和陌生对象交流。类尽量少的依赖其他类，只和自己直接相关的类有使用。

**设计模式一共23种，分为3个大类，创建型、结构型、行为型。**

### 创建型(Creational Patterns)

| 名称                                                         | 难度 |
| ------------------------------------------------------------ | ---- |
| [工厂模式（Factory Method）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95.md) | 2星  |
| [抽象工厂模式（Abstract Factory）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82.md) | 4星  |
| [建造者模式（Builder）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F/%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F.md) | 2星  |
| [单例模式（Singleton）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F.md) | 1星  |
| [原型模式（Prototype）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8F/%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8F.md) | 2星  |

### 结构型(Structural Patterns)

| 名称                                                         | 难度 |
| ------------------------------------------------------------ | ---- |
| [适配器模式（Adapter）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F/%E9%80%82%E9%85%8D%E6%A8%A1%E5%BC%8F.md) | 1星  |
| [桥接模式（Bridge）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F/%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F.md) | 4星  |
| [组合模式（Composite）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F/%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F.md) | 3星  |
| [装饰器模式（Decorator）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E8%A3%85%E9%A5%B0%E5%99%A8%E6%A8%A1%E5%BC%8F/%E8%A3%85%E9%A5%B0%E5%99%A8%E6%A8%A1%E5%BC%8F.md) | 2星  |
| [外观模式（Facade）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8F/%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8F.md) | 1星  |
| [享元模式（Flyweight）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E4%BA%AB%E5%85%83%E6%A8%A1%E5%BC%8F/%E4%BA%AB%E5%85%83%E6%A8%A1%E5%BC%8F.md) | 4星  |
| [代理模式（Proxy）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F.md) | 3星  |

### 行为型(Behavioral Patterns)

| 名称                                                         | 难度 |
| ------------------------------------------------------------ | ---- |
| [责任链模式（Chain of responsibility）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E8%B4%A3%E4%BB%BB%E9%93%BE%E6%A8%A1%E5%BC%8F/%E8%B4%A3%E4%BB%BB%E9%93%BE%E6%A8%A1%E5%BC%8F.md) | 1星  |
| [命令模式（Command）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F/%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F.md) | 3星  |
| 解释器模式（Interpreter）（几乎用不上，略过）                | 5星  |
| [迭代器模式（Iterator）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E8%BF%AD%E4%BB%A3%E5%99%A8%E6%A8%A1%E5%BC%8F/%E8%BF%AD%E4%BB%A3%E5%99%A8%E6%A8%A1%E5%BC%8F.md) | 2星  |
| [中介者模式（Mediator）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E4%B8%AD%E4%BB%8B%E8%80%85%E6%A8%A1%E5%BC%8F/%E4%B8%AD%E4%BB%8B%E8%80%85%E6%A8%A1%E5%BC%8F.md) | 3星  |
| [备忘录模式（Memento）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E5%A4%87%E5%BF%98%E5%BD%95%E6%A8%A1%E5%BC%8F/%E5%A4%87%E5%BF%98%E5%BD%95%E6%A8%A1%E5%BC%8F.md) | 2星  |
| [观察者模式（Observer）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F/%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F.md) | 2星  |
| [策略模式（Strategy）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F/%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F.md) | 2星  |
| [状态模式（State）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F/%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F.md) | 3星  |
| [模板方法模式（Template method）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E6%A8%A1%E6%9D%BF%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F/%E6%A8%A1%E6%9D%BF%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F.md) | 2星  |
| [访问者模式（Visitor）](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F/%E8%AE%BF%E9%97%AE%E8%80%85%E6%A8%A1%E5%BC%8F/%E8%AE%BF%E9%97%AE%E8%80%85%E6%A8%A1%E5%BC%8F.md) | 5星  |

## 2.Linux相关

### [linux IO模型](https://github.com/lindo-zy/CodeZero/blob/main/docs/Linux%E7%9B%B8%E5%85%B3/IO%E6%A8%A1%E5%9E%8B/IO%E6%A8%A1%E5%9E%8B.md)

### [进程和线程](https://github.com/lindo-zy/CodeZero/blob/main/docs/Linux%E7%9B%B8%E5%85%B3/%E8%BF%9B%E7%A8%8B%E5%92%8C%E7%BA%BF%E7%A8%8B/%E8%BF%9B%E7%A8%8B%E5%92%8C%E7%BA%BF%E7%A8%8B.md)

## 3.计算机

### 数据结构

#### [红黑树、B树、B+树](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%A1%E7%AE%97%E6%9C%BA/%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84/%E7%BA%A2%E9%BB%91%E6%A0%91%E3%80%81B%E6%A0%91%E3%80%81B%2B%E6%A0%91.md)

------

#### [哈希算法](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%A1%E7%AE%97%E6%9C%BA/%E5%93%88%E5%B8%8C/%E5%93%88%E5%B8%8C%E7%AE%97%E6%B3%95.md)

##### [pdf版本](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E8%AE%A1%E7%AE%97%E6%9C%BA/%E5%93%88%E5%B8%8C/%E5%93%88%E5%B8%8C%E7%AE%97%E6%B3%95.pdf)

------

## 4.编程语言相关

### python

#### [搞定python装饰器](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E7%BC%96%E7%A8%8B%E8%AF%AD%E8%A8%80/python%E8%A3%85%E9%A5%B0%E5%99%A8/%E6%90%9E%E5%AE%9Apython%E8%A3%85%E9%A5%B0%E5%99%A8.md)

#### [GIL全局解释器锁](https://github.com/lindo-zy/CodeZero/blob/main/docs/%E7%BC%96%E7%A8%8B%E8%AF%AD%E8%A8%80/python/GIL/GIL%E5%85%A8%E5%B1%80%E8%A7%A3%E9%87%8A%E5%99%A8%E9%94%81.md)

