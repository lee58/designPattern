package com.liguogang.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
* @Description: 享元工厂 FlyweightFactory
* @Author:      LiGuoGang
* @date:    2021/2/6 16:14
*/
public class FlyweightFactory {

    private static Map<String, IFlyweight> pool = new HashMap<String, IFlyweight>();

    public static IFlyweight getFlyweight(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return pool.get(intrinsicState);
    }
}
