package com.liguogang.ProxyPattern.jdk2;

import java.lang.reflect.Method;

public interface LiGuogangInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
