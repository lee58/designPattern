package com.liguogang.DecoratorPattern;
/**
* @Description:  抽象装饰器 Decorator
* @Author:      LiGuoGang
* @date:    2021/2/6 9:41
*/
public abstract class Decorator extends Component {
    public Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 转发请求给组件对象，可以在转发前后执行一些附加动作
        component.operation();
    }
}
