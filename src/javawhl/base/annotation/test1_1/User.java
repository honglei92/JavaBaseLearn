package javawhl.base.annotation.test1_1;

public class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    @ShawShank(value = "honglei")
    public void setName(String name) {
        this.name = name;
    }

    String getAge() {
        return age;
    }

    @ShawShank(value = "26")
    public void setAge(String age) {
        this.age = age;
    }
}
