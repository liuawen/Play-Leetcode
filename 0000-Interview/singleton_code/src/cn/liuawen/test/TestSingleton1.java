package cn.liuawen.test;

import cn.liuawen.single.Singleton1;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-19
 */
public class TestSingleton1 {
    public static void main(String[] args) {
        Singleton1 s = Singleton1.INSTANCE;
        System.out.println(s);//cn.liuawen.single.Singleton1@1b6d3586
        //类名hashcode编码
    }
}
