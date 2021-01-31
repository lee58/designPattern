package com.liguogang.ProxyPattern.jdk2;

import com.liguogang.ProxyPattern.jdk.IPerson;
import com.liguogang.ProxyPattern.jdk.Zhangsan;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        LiGuogangMeipo liGuogangMeipo = new LiGuogangMeipo();
        IPerson zhangsan = liGuogangMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();
    }
}
