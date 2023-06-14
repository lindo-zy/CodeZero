package behavioral_pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 备忘录模式：设计一个简单的游戏存档功能，支持保存和恢复游戏存档。
 */
public class MementoPattern {


    public static void main(String[] args) {

        GameOriginator gameOriginator = new GameOriginator();
        GameCareTaker gameCareTaker = new GameCareTaker();
        gameOriginator.playGame();
        gameCareTaker.saveMemento(gameOriginator.saveProcess());
        gameOriginator.exitGame();

        gameOriginator.restoreProcess(gameCareTaker.getMemento(0));
        gameOriginator.playGame();
    }

    /**
     * 游戏原发器
     */
    static class GameOriginator {
        private int currentScore;

        public GameProgressMemento saveProcess() {
            return new GameProgressMemento(currentScore);
        }

        public void restoreProcess(GameProgressMemento gameProgressMemento) {
            currentScore = gameProgressMemento.getScore();
        }

        //对内部状态的使用
        public void playGame() {
            System.out.println("------------------开始游戏------------------");
            System.out.println("当前分数为：" + currentScore);
            System.out.println("杀死一个小怪物得1分");
            currentScore++;
            System.out.printf("总分为：%d%n", currentScore);
        }

        public void exitGame() {
            System.out.println("退出游戏");
            currentScore = 0;
            System.out.println("-----------------退出游戏-------------------");
        }
    }

    /**
     * 构建备忘录
     */
    static class GameProgressMemento {
        private int score;

        public GameProgressMemento(int score) {
            this.score = score;
        }

        public int getScore() {
            return this.score;
        }
    }

    /**
     * 游戏存档管理器
     */
    static class GameCareTaker {
        private List<GameProgressMemento> mementos = new ArrayList<>();

        /**
         * 保存存档
         *
         * @param memento
         */
        public void saveMemento(GameProgressMemento memento) {
            this.mementos.add(memento);
        }

        /**
         * 读取存档
         *
         * @param index
         * @return
         */
        public GameProgressMemento getMemento(int index) {
            return this.mementos.get(index);
        }
    }
}
