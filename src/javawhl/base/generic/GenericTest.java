package javawhl.base.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator 泛型
 */
public class GenericTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("abc");
        for (String str : list) {
            System.out.println(str);
        }
        Box<String, String> name;
        name = new Box<>("honglei92", "字符串");
        Box<Integer, String> age;
        age = new Box<>(24, "数字");
        getData(name);
        getStringData(age);
    }

    private static void getData(Box<?, ?> name) {
        System.out.println("name:" + name.getData() + name.getType());
    }

    private static void getStringData(Box<? extends Number, ?> name) {
        System.out.println("age:" + name.getData() + name.getType());
    }

    static class Box<T, P> {
        private T data;
        private P type;

        public Box(T data, P type) {
            this.data = data;
            this.type = type;
        }

        public T getData() {
            return data;
        }

        P getType() {
            return type;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
