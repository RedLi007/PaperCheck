package com.redli.test;

import com.redli.util.FileUtil;
import com.redli.util.SimHashUtil;
import org.junit.Test;

public class TestSimHashUtil {

    @Test
    public void TestgetHash() {
        String[] strings = {"一位","真正","的","作家","永远","只","为","内心","写作"};
        for (String string : strings) {
            String stringHash = SimHashUtil.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void TestgetSimHash() {
        String str0 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig.txt");
        String str1 = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig_0.8_add.txt");
        System.out.println(SimHashUtil.getSimHash(str0));
        System.out.println(SimHashUtil.getSimHash(str1));
    }

}
