package structural_pattern.bridge;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 奶茶分为，小杯，中杯，大杯；根据甜度，又分为，五分糖，七分糖，全糖。
 */
public class Normal {
    public static void main(String[] args) {
        SmallMilkTea smallTeaWithFiveSugar = new SmallMilkTea("半糖");
        LargeMilkTea largeTeaWithFullSugar = new LargeMilkTea("全糖");

        smallTeaWithFiveSugar.makeTea();
        largeTeaWithFullSugar.makeTea();
    }

    /**
     * 奶茶类
     */
    static class MilkTea {
        protected String size;
        protected String sugar;

        public MilkTea(String size, String sugar) {
            this.size = size;
            this.sugar = sugar;
        }

        public void makeTea() {
            System.out.print(size + "奶茶");
            switch (sugar) {
                case "半糖":
                    System.out.println("半糖");
                    break;
                case "七分糖":
                    System.out.println("七分糖");
                    break;
                case "全糖":
                    System.out.println("全糖");
                    break;
                default:
                    break;
            }
        }
    }

    static class SmallMilkTea extends MilkTea {
        public SmallMilkTea(String sugar) {
            super("小杯", sugar);
        }
    }

    static class MediumMilkTea extends MilkTea {
        public MediumMilkTea(String sugar) {
            super("中杯", sugar);
        }
    }

    static class LargeMilkTea extends MilkTea {
        public LargeMilkTea(String sugar) {
            super("大杯", sugar);
        }
    }
}
