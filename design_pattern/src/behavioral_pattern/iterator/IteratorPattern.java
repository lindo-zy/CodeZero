package behavioral_pattern.iterator;

/**
 * @author ：lindo-zy https://github.com/lindo-zy
 * //迭代器模式:实现一个可以for循环遍历的类。
 */
public class IteratorPattern {
    public static void main(String[] args) {
        Collection collection = new Collection();

        for (Iterator iterator = collection.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("元素:" + name);
        }
        //        元素:Ann
        //        元素:Alice
        //        元素:Bob
        //        元素:Candy


    }

    /**
     * 迭代器接口
     */
    interface Iterator {
        /**
         * 判断是否可以继续迭代
         *
         * @return
         */
        public boolean hasNext();

        /**
         * 取下一个元素
         *
         * @return
         */
        public Object next();
    }

    /**
     * 迭代集合接口
     */
    interface IterableCollection {
        /**
         * 获取迭代器
         *
         * @return
         */
        Iterator getIterator();
    }

    /**
     * 集合类
     */
    static class Collection implements IterableCollection {
        public String[] names = {"Ann", "Alice", "Bob", "Candy"};

        @Override
        public Iterator getIterator() {
            return new CollectionIterator();
        }

        /**
         * 集合迭代器
         */
        private class CollectionIterator implements Iterator {
            int index;

            @Override
            public boolean hasNext() {
                return index < names.length;
            }

            @Override
            public Object next() {
                if (this.hasNext()) {
                    return names[index++];
                }
                return null;
            }
        }
    }
}
