package com.mashibing.dp.singleton;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-05
 */
public class Singleton01 {
    private static  final Singleton01 INSTANCE = new Singleton01();
    private Singleton01(){

    }
    public static Singleton01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        System.out.println(s1 == s2);
    }

}
