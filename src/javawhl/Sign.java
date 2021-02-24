package javawhl;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.*;

/**
 * author  honglei92
 * date    2020/11/19
 */
/**
 * Java调用CMD命令
 */
public class Sign {
    public static void main(String[] args) {
        String command2 = "jarsigner -verbose -keystore D:\\01whl\\key\\tianmagongchang.jks -signedjar D:\\sign\\vivo-new-signed.apk D:\\sign\\vivo\\vivo_unsign.apk think";
        String command = "echo tm123456|keytool -v -list -keystore D:\\01whl\\key\\tianmagongchang.jks";
        cmd(command, command2);
    }

    public static boolean cmd(String command, String command2) {
        boolean flag = false;
        try {
            Process ps = Runtime.getRuntime().exec("cmd.exe /C start " + command);
            flag = true;
            InputStreamReader i = new InputStreamReader(ps.getInputStream(), "GBK");
            String line;
            BufferedReader ir = new BufferedReader(i);
            StringBuffer b = new StringBuffer();
            while ((line = ir.readLine()) != null) {
                if (line.length() > 0) {
                    // System.out.println(line);
                    if (line.startsWith("别名:"))
                        b.append(line + "\n");
                }
            }
            System.out.println(b.toString());
            String a = b.toString().replace("别名:", "");

            cmd(command2.replace("think", a));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean cmd(String command) {
        boolean flag = false;
        try {
            Process ps = Runtime.getRuntime().exec("cmd.exe /C start " + command);
            flag = true;
            InputStreamReader i = new InputStreamReader(ps.getInputStream(), "GBK");
            String line;
            BufferedReader ir = new BufferedReader(i);
            while ((line = ir.readLine()) != null) {
                if (line.length() > 0) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}