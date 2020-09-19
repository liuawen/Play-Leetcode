package cn.liuawen.test;

import cn.liuawen.single.Singleton3;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-19
 */
public class TestSingleton3 {
    public static void main(String[] args) {
        Singleton3 s = Singleton3.INSTANCE;
        System.out.println(s);//Singleton3{info='liuawen'}
        //没有重写toString方法  cn.liuawen.single.Singleton3@4554617c

    }
}
