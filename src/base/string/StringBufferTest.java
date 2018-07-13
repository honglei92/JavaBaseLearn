package base.string;

import util.TimeUtil;

/**
 * String、StringBuilder、StringBuffer
 *
 * author:https://github.com/honglei92
 * time:2018/7/13
 */
public class StringBufferTest {
    static String s;
    static StringBuffer stringBuffer = new StringBuffer("name");
    static StringBuilder stringBuilder = new StringBuilder("name");

    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "1221123";
        String s3 = "dwwqeqwe";
        TimeUtil.showNow();
        for (int i = 0; i < 100000; i++) {
            //快
//            s = "name" + "123" + "1221123" + "dwwqeqwe" + "123" + "1221123" + "dwwqeqwe" + "123" + "1221123" + "dwwqeqwe";
            //慢
            s = "name" + s1 + s2 + s3 + s1 + s2 + s3 + s1 + s2 + s3;
        }
        TimeUtil.showNow();
        for (long i = 0; i < 100000; i++) {
            stringBuffer.append("123").append("1221123").append("dwwqeqwe").append("123").append("1221123").append("dwwqeqwe").append("123").append("1221123").append("dwwqeqwe");
        }
        TimeUtil.showNow();
        for (long i = 0; i < 100000; i++) {
            stringBuilder.append("123").append("1221123").append("dwwqeqwe").append("123").append("1221123").append("dwwqeqwe").append("123").append("1221123").append("dwwqeqwe");
        }
        TimeUtil.showNow();
    }
}
