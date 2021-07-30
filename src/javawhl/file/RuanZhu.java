package javawhl.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

public class RuanZhu {
    private static List<String> pathList = new ArrayList<>();
    static String oneFile = "";
    static int lines = 0;
    static int codeRequestLine = 4500;

    public static void main(String[] args) {
        System.out.println("arg0");
        folderMethod2("D:\\01whl\\07工作文档\\软著申请\\软著代码安卓");
        // folderMethod2("D:\\01whl\\07工作文档\\软著申请\\有赞商城");
        for (int i = 0; i < 1; i++) {
            buildFile(i);
        }

    }

    private static void buildFile(int i) {
        lines = 0;
        oneFile = "";
        Collections.shuffle(pathList);// 混淆排序
        for (int j = 0; j < pathList.size(); j++) {
            if (lines <= codeRequestLine)
                readFile(i, pathList.get(j));
        }
        writeFile(i, oneFile);
    }

    /**
     * 读入TXT文件
     * 
     * @param i
     * @param lines
     * @param oneFile
     * @param progress
     * @param string
     */
    public static void readFile(int i, String pathname) {
        // 绝对路径或相对路径都可以，写入文件时演示相对路径,读取以上路径的input.txt文件
        // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
        // 不关闭文件会导致资源的泄露，读写文件都同理
        // Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(pathname), "UTF-8");
                BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            // 网友推荐更加简洁的写法

            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                System.out.println(line);
                if (line.trim().startsWith("private")) {
                    oneFile += "//" + Word.worlds[(int) (Math.random() * 115)] + "\r\n";
                }
                // if (line.trim().startsWith("@Override")) {
                //     oneFile += "//" + Word.worlds[(int) (Math.random() * 115)] + "\r\n";
                // }
                // if (line.trim().startsWith("package")) {
                //     oneFile += "//声明你的包名\r\n";
                // }
                lines++;
                oneFile += (line + "\r\n");
                // if (line.trim().endsWith("{")) {
                //     oneFile += "//" + Word.worlds[(int) (Math.random() * 115)] + "\r\n";
                // }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(int i, String line) {
        try {
            File writeName = new File("D:\\01whl\\07工作文档\\软著申请\\软著输出安卓\\" + i + "output_android_beijinghuairou_tj.doc"); // 相对路径，如果没有则要建立一个新的output.txt文件
            // File writeName = new File("D:\\01whl\\07工作文档\\软著申请\\" + i + "有赞商城.doc"); // 相对路径，如果没有则要建立一个新的output.txt文件
            if (!writeName.exists())
                writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            try (
                    // FileWriter writer = new FileWriter(writeName);
                    OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(writeName), "UTF-8");
                    BufferedWriter out = new BufferedWriter(writer)) {
                out.write(line + "\r\n"); // \r\n即为换行
                // out.flush(); // 把缓存区内容压入文件
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void folderMethod2(String path) {
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null != files) {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        folderMethod2(file2.getAbsolutePath());
                    } else {
                        System.out.println("文件:" + file2.getAbsolutePath());
                        pathList.add(file2.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

    public static interface Progress {
        void end(int lines);
    }
}