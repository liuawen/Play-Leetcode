package cn.liuawen.test;

import cn.liuawen.single.Singleton2;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-19
 */
public class TestSingleton2 {
    public static void main(String[] args) {
        //枚举不是new呀
        // Singleton2 s = new Singleton2.INSTANCE;
        Singleton2 s = Singleton2.INSTANCE;
        System.out.println(s);//INSTANCE
        //打印出来不一样   枚举重写了toString方法
    }
}
