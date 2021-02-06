package com.liguogang.DecoratorPattern;
/**
* @Description: 具体组件 ConcreteComponent
* @Author:      LiGuoGang
* @date:    2021/2/6 9:38
*/
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("处理具体的业务逻辑");
    }
}
