package com.liguogang.ProxyPattern.jdk2;

import com.liguogang.ProxyPattern.jdk.IPerson;

import java.lang.reflect.Method;

public class LiGuogangMeipo implements LiGuogangInvocationHandler {

    private IPerson target;

    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<? extends IPerson> clazz = target.getClass();
        return (IPerson) LiGuogangProxy.newProxyInstance(new LiGuogangClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("我是媒婆，双方交往完毕");
    }

    private void before() {
        System.out.println("我是媒婆，开始物色");
    }
}
