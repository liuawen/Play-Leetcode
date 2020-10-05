package com.mashibing.dp.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 * 完美写法之一  第一 有点小毛病
 * 调用getInstance加载
 * JVM加载class只加载一次 内部保证   加载一次 Holder也只加载 只有这一个对象
 */
public class Mgr07 {

    private Mgr07() {
    }

    private static class Mgr07Holder {
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    public static Mgr07 getInstance() {
        return Mgr07Holder.INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }


}
