package com.liguogang.FacadePattern;
/**
* @Description: 外观角色 Facade
* @Author:      LiGuoGang
* @date:    2021/2/2 22:14
*/
public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void doA() {
        this.subSystemA.doA();
    }

    public void doB() {
        this.subSystemB.doB();
    }

    public void doC() {
        this.subSystemC.doC();
    }
}
