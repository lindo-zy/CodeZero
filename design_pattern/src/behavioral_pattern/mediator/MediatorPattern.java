package behavioral_pattern.mediator;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * //中介者模式:设计房屋中介，买家和房东都需要通过中介进行交易。
 */
public class MediatorPattern {
    public static void main(String[] args) {
        Realtor realtor = new Realtor();

        //房主和客户都找中介传递消息
        Seller seller = new Seller("alice", realtor);
        Customer customer = new Customer("bob", realtor);

        realtor.setSeller(seller);
        realtor.setCustomer(customer);

        customer.contact("200平的大平层出售吗？");
        seller.contact("是的，你多久来看房？");
    }

    /**
     * 中介接口
     */
    interface Mediator {
        /**
         * 联系方法
         *
         * @param message
         * @param person
         */
        void contact(String message, Person person);
    }


    /**
     * 人员抽象类
     */
    static abstract class Person {
        protected String name;
        protected Mediator mediator;

        Person(String name, Mediator mediator) {
            this.mediator = mediator;
            this.name = name;
        }
    }

    /**
     * 中介
     */
    static class Realtor implements Mediator {
        private Customer customer;
        private Seller seller;


        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public Seller getSeller() {
            return seller;
        }

        public void setSeller(Seller seller) {
            this.seller = seller;
        }


        @Override
        public void contact(String message, Person person) {
            if (person == seller) {
                customer.getMessage(message);
            } else {
                seller.getMessage(message);
            }
        }
    }


    /**
     * 房主
     */
    static class Seller extends Person {

        Seller(String name, Mediator mediator) {
            super(name, mediator);
        }

        public void contact(String message) {
            mediator.contact(message, this);
        }

        public void getMessage(String message) {
            System.out.println("房主：" + name + ",信息：" + message);
        }
    }

    /**
     * 客户
     */
    static class Customer extends Person {

        Customer(String name, Mediator mediator) {
            super(name, mediator);
        }

        public void contact(String message) {
            mediator.contact(message, this);
        }

        public void getMessage(String message) {
            System.out.println("客户：" + name + ",信息：" + message);
        }
    }

}
