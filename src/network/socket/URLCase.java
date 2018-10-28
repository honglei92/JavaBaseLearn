package network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * url基本属性
 */
public class URLCase {
    public static void main(String[] args) throws Exception {
        // testURL();
        readWebpageContent();
    }

    /**
     * URL读取网页
     *
     * @throws IOException
     */
    private static void readWebpageContent() throws IOException {
        URL url = new URL("http://developer.51cto.com/art/201509/490775.htm");
        InputStream is = url.openStream();// openStream������ȡ�ֽ�������
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");// ���ֽ�������ת�����ַ�������
        BufferedReader br = new BufferedReader(isr);// Ϊ�ַ�������ӻ��壬���Ч��
        String data = br.readLine();// ��ȡ����
        while (data != null) {
            System.out.println(data);// �������
            data = br.readLine();
        }
        br.close();// �رջ���
        isr.close();// �ر��ַ���
        is.close();// �ر��ֽ���
    }

    /**
     * URL属性
     *
     * @throws Exception
     */
    private static void testURL() throws Exception {
        URL baidu = new URL("http://www.baidu.com");
        baidu = new URL(baidu, "/index.html?username=tom#test");
        System.out.println(baidu.getProtocol());
        System.out.println(baidu.getHost());
        System.out.println(baidu.getPort());
        System.out.println(baidu.getPath());
        System.out.println(baidu.getFile());
        System.out.println(baidu.getRef());
        System.out.println(baidu.getQuery());
    }
}
