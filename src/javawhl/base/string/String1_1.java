package javawhl.base.string;

public class String1_1 {
    public static void main(String[] args) {
        final String a;
        a = "1234567890";
        System.out.println(a);
        final House house = new House();
        house.floor = 3;
        house.size = 88.99;
        house.floor = 4;
        System.out.println("floor:" + house.floor + ",size：" + house.size);
    }
}

final class House {
    Double size;
    int floor;
}
