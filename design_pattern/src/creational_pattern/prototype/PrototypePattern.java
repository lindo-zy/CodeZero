package creational_pattern.prototype;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 原型模式
 * 需求：生成一个克隆人，具备：名字、年龄、性别、外貌
 */
public class PrototypePattern {
    public static void main(String[] args) {

        People realPeople = new People("Bob", "25", "男", "帅气");

        System.out.println(realPeople);
        People clonePeople = (People) realPeople.clonePrototype();
        System.out.println(clonePeople);

        Human realHuman = new Human("Alice", "18", "女", "漂亮");

        System.out.println(realHuman);
        try {
            Human cloneHuman = (Human) realHuman.clone();
            System.out.println(cloneHuman);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

    /**
     * 原型接口
     */
    interface Prototype {
        /**
         * 克隆原型方法
         *
         * @return Prototype
         */
        Prototype clonePrototype();
    }

    /**
     * 人类
     */
    static class People implements Prototype {
        private String name;
        private String age;
        private String gender;
        private String appearance;

        public People(String name, String age, String gender, String appearance) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.appearance = appearance;
        }


        @Override
        public Prototype clonePrototype() {
            return new People(name, age, gender, appearance);
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", gender='" + gender + '\'' +
                    ", appearance='" + appearance + '\'' +
                    '}';
        }
    }


    /**
     * human类,实现Cloneable接口，才可重写clone方法使用
     */
    static class Human implements Cloneable {
        private String name;
        private String age;
        private String gender;
        private String appearance;

        public Human(String name, String age, String gender, String appearance) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.appearance = appearance;
        }

        /**
         * 重写类的clone方法
         *
         * @return Object
         * @throws CloneNotSupportedException
         */
        @Override
        protected Object clone() throws CloneNotSupportedException {
            Object clone = null;
            try {
                clone = super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return clone;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", gender='" + gender + '\'' +
                    ", appearance='" + appearance + '\'' +
                    '}';
        }
    }

}
