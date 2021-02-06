package com.liguogang.DecoratorPattern;
/**
* @Description: 具体装饰器B ConcreteDecoratorB
* @Author:      LiGuoGang
* @date:    2021/2/6 9:49
*/
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void beforeOperation() {
        System.out.println("ConcreteDecoratorB beforeOperation");
    }

    private void afterOperation() {
        System.out.println("ConcreteDecoratorB afterOperation");
    }

    @Override
    public void operation() {
        beforeOperation();
        super.operation();
        afterOperation();
    }
}
