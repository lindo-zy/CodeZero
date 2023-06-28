package behavioral_pattern.template_method;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 模板方法模式：实现一个单板的初始化流程，有update、init、load
 */
public class TemplateMethod {
    public static void main(String[] args) {
        Board board = new BaseBandBoard();
        board.loading();

    }

    static abstract class Board {

        /**
         * 单板更新版本
         */
        abstract void update();

        /**
         * 单板初始化
         */
        abstract void init();

        /**
         * 单板加载
         */
        abstract void load();

        /**
         * 基带板初始化
         */
        public final void loading() {
            update();
            init();
            load();
        }
    }


    static class BaseBandBoard extends Board {

        @Override
        void update() {
            System.out.println("基带单板版本更新！");
        }

        @Override
        void init() {
            System.out.println("基带单板初始化！");
        }

        @Override
        void load() {
            System.out.println("基带单板加载！");
        }
    }
}

