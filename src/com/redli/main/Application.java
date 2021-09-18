package com.redli.main;

import com.redli.util.FileUtil;
import com.redli.util.HammingUtil;
import com.redli.util.SimHashUtil;

public class Application {

    public static void main(String[] args) {
        // 从命令行输入的路径名读取对应的文件，将文件的内容转化为对应的字符串
        String str0 = FileUtil.readFile(args[0]);
        String str1 = FileUtil.readFile(args[1]);
        String writeFileName = args[2];
        // 由字符串得出对应的 simHash值
        String simHash0 = SimHashUtil.getSimHash(str0);
        String simHash1 = SimHashUtil.getSimHash(str1);
        // 由 simHash值求出相似度
        double similarity = HammingUtil.getSimilarity(simHash0, simHash1);
        // 把相似度写入最后的结果文件中
        FileUtil.writeFile(similarity, writeFileName);
        // 退出程序
        System.exit(0);
    }

}
