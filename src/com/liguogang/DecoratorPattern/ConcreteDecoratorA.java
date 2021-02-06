package com.liguogang.DecoratorPattern;
/**
* @Description: 具体装饰器A ConcreteDecoratorA
* @Author:      LiGuoGang
* @date:    2021/2/6 9:49
*/
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private void beforeOperation() {
        System.out.println("ConcreteDecoratorA beforeOperation");
    }

    private void afterOperation() {
        System.out.println("ConcreteDecoratorA afterOperation");
    }

    @Override
    public void operation() {
        beforeOperation();
        super.operation();
        afterOperation();
    }
}
