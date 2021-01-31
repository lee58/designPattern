package com.liguogang.ProxyPattern.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson instance = jdkMeipo.getInstance(new Zhangsan());
        instance.findLove();

        // 通过反编译工具查看源代码
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\project\\designPattern\\src\\com\\liguogang\\ProxyPattern\\jdk\\$Proxy0.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
