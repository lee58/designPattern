package com.liguogang.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
* @Description: 树枝节点 Composite
* @Author:      LiGuoGang
* @date:    2021/2/6 17:45
*/
public class Composite extends Component{

    private List<Component> components;

    public Composite(String name) {
        super(name);
        this.components = new ArrayList<Component>();
    }

    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(this.name);
        for (Component component : this.components) {
            builder.append("\n");
            builder.append(component.operation());
        }
        return builder.toString();
    }

    public boolean addChild(Component component) {
        return components.add(component);
    }

    public boolean removeChild(Component component) {
        return components.remove(component);
    }

    public Component getChild(int index) {
        return components.get(index);
    }
}
