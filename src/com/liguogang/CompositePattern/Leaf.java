package com.liguogang.CompositePattern;
/**
* @Description: 叶子节点 Leaf
* @Author:      LiGuoGang
* @date:    2021/2/6 17:53
*/
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return this.name;
    }
}
