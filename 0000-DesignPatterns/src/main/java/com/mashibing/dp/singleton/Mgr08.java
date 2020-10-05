package com.mashibing.dp.singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化。
 * 反序列化
 * 枚举单例  不会被反序列化  枚举类没有构造方法 拿到class文件 没有办法构造对象
 * 完美
 * 为什么枚举 没有构造方法  Java语言的规定
 *
 * 工作 心中有剑  手中无剑  解决实际问题更方便
 */
public enum Mgr08 {

    INSTANCE;

    public void m() {}

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }

}
