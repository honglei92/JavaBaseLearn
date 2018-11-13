package javawhl.base.annotation.test1_1;

import java.lang.reflect.Method;

class UserFactory {
    static User create() {
        User user = new User();
        Method[] methods = User.class.getMethods();
        try {
            for (Method method : methods) {//迭代
                if (method.isAnnotationPresent(ShawShank.class)) {
                    ShawShank shawShank = method.getAnnotation(ShawShank.class);
                    method.invoke(user, shawShank.value());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return user;
    }
}
