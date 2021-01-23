package com.liguogang.ProxyPattern;
/**
* @Description: 代理角色 Proxy
* @Author:      LiGuoGang
* @date:    2021/1/23 10:32
*/
public class Proxy implements ISubject {

    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void after() {
        System.out.println("called after request");
    }

    private void before() {
        System.out.println("called before request");
    }


}
