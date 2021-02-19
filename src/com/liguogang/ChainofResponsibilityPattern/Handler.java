package com.liguogang.ChainofResponsibilityPattern;
/**
* @Description: 抽象处理者
* @Author:      LiGuoGang
* @date:    2021/2/19 22:33
*/
public abstract class Handler {

    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}
