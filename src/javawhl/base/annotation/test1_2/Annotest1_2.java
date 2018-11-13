package javawhl.base.annotation.test1_2;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Annotest1_2 {
    @Age("whl")
    String age;
    @Age(value = "921120")
    String birthday;

    public static void main(String[] args) {
        dance();
        LetMeIn letMeIn = new LetMeIn();
        letMeIn.say();
    }

    @Fallin(name = "12345678", id = 1)
    @Fallin(name = "abc", id = 2)
    @Fallin(name = "one two three", id = 3)
    void sing() {
        System.out.println("i am singing");
    }

    @SuppressWarnings("deprecated")
    @Deprecated
    public static void dance() {

    }
}

@interface Loves {
    Fallin[] value();
}

@Retention(RetentionPolicy.CLASS)
@Repeatable(Loves.class)
@interface Fallin {
    String name() default "123";

    int id();
}

@SuppressWarnings(value = "123")
@interface Age {
    String value();
}

class Mend extends Annotest1_2 {
    @Override
    public void sing() {
        super.sing();
    }

    public static void main(String[] args) {
    }
}

class LetMeIn {
    public static void main(String[] args) {

    }

    void say() {
        Mend mend = new Mend();
        mend.sing();
    }
}
