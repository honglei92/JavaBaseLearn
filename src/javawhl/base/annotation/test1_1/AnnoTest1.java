package javawhl.base.annotation.test1_1;

public class AnnoTest1 {
    public static void main(String[] args) throws
            IllegalAccessError, IllegalArgumentException ,NullPointerException{
        User user = UserFactory.create();
        System.out.println("name:" + user.getName());
        System.out.println("age:" + user.getAge());
        User user1 = new User();
        System.out.println("name:" + user1.getName());
        System.out.println("age:" + user1.getAge());

    }
}
