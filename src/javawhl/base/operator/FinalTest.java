package javawhl.base.operator;

/**
 * final修饰一个对象，能否调用对象修改属性的方法
 * author:https://github.com/honglei92
 * time:2018/7/13
 */
public class FinalTest {
    public static void main(String[] args) {
        final House house = new House();
        house.setFloor("21");
        System.out.println(house.floor);
    }

    static class House {
        public String getFloor() {
            return floor;
        }

        public void setFloor(String floor) {
            this.floor = floor;
        }

        private String floor;
    }
}
