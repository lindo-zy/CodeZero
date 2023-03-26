package structural_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * 享元模式：游戏创建角色换皮肤功能，换皮肤时，当前游戏角色的：性别、身高不需要改变，仅改变角色的穿着这个属性。
 * 享元：内部状态为:外貌、性别、身高;外部状态为：穿着
 */
public class FlyweightPattern {
    public static void main(String[] args) {
        //客户端使用
        Role heroRole = new RoleFactory().getRole("男", 180, "星际战甲");
        System.out.println(heroRole.hashCode());
        heroRole.changeDress("至臻冰甲");
        System.out.println(heroRole.hashCode());
        heroRole.changeDress("轮回披风");
        System.out.println(heroRole.hashCode());

    }

    /**
     * 角色接口
     */
    interface Role {


        /**
         * 换皮肤
         *
         * @param dress
         */
        void changeDress(String dress);

    }

    /**
     * 英雄角色类
     */
    static class HeroRole implements Role {
        //内部状态
        private String sex;
        private int height;

        public HeroRole(String sex, int height) {
            this.sex = sex;
            this.height = height;
        }

        @Override
        public void changeDress(String dress) {
            System.out.println("性别：" + sex + "身高：" + height + ",当前皮肤为：" + dress);
        }
    }

    /**
     * 角色工厂类
     */
    static class RoleFactory {
        private static final Map<String, Role> ROLE_MAP = new HashMap<>();

        /**
         * 获取角色
         *
         * @param dress
         * @return
         */
        public Role getRole(String sex, int height, String dress) {
            Role role = ROLE_MAP.get(dress);
            if (role == null) {
                role = new HeroRole(sex, height);
                ROLE_MAP.put(dress, role);
            }

            return role;
        }
    }
}
