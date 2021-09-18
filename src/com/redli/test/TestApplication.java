package com.redli.test;

import com.redli.util.FileUtil;
import com.redli.util.HammingUtil;
import com.redli.util.SimHashUtil;
import org.junit.Test;

public class TestApplication {

    @Test
    public void TestorigAndOrig(){
        String str0 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig.txt");
        String str1 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig.txt");
        String writeFileName = "D:\\mycode\\PaperCheck\\TestOutput\\OrigAndOrig.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        FileUtil.writeFile(ans, writeFileName);
    }

    @Test
    public void TestorigAndAdd(){
        String str0 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig.txt");
        String str1 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig_0.8_add.txt");
        String writeFileName = "D:\\mycode\\PaperCheck\\TestOutput\\OrigAndAdd.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        FileUtil.writeFile(ans, writeFileName);
    }

    @Test
    public void TestorigAndDel(){
        String str0 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig.txt");
        String str1 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig_0.8_del.txt");
        String writeFileName = "D:\\mycode\\PaperCheck\\TestOutput\\OrigAndDel.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        FileUtil.writeFile(ans, writeFileName);
    }

    @Test
    public void TestorigAndDis1(){
        String str0 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig.txt");
        String str1 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig_0.8_dis_1.txt");
        String writeFileName = "D:\\mycode\\PaperCheck\\TestOutput\\OrigAndDis1.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        FileUtil.writeFile(ans, writeFileName);
    }

    @Test
    public void TestorigAndDis10(){
        String str0 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig.txt");
        String str1 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig_0.8_dis_10.txt");
        String writeFileName = "D:\\mycode\\PaperCheck\\TestOutput\\OrigAndDis10.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        FileUtil.writeFile(ans, writeFileName);
    }

    @Test
    public void TestorigAndDis15(){
        String str0 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig.txt");
        String str1 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig_0.8_dis_15.txt");
        String writeFileName = "D:\\mycode\\PaperCheck\\TestOutput\\OrigAndDis15.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        FileUtil.writeFile(ans,writeFileName);
    }

}
