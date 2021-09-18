package com.redli.test;

import com.redli.util.FileUtil;
import com.redli.util.HammingUtil;
import com.redli.util.SimHashUtil;
import org.junit.Test;

public class TestHammingUtil {

    @Test
    public void testHammingUtil() {
        String str0 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig.txt");
        String str1 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig_0.8_add.txt");
        int distance = HammingUtil.getHammingDistance(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        double similarity = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        System.out.println("str0和str1的汉明距离: " + distance);
        System.out.println("str0和str1的相似度:" + similarity);
    }

}
