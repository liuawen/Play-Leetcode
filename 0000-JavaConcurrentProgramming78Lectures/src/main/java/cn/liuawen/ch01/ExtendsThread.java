package cn.liuawen.ch01;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-24
 * 继承 Thread 类
 * 承 Thread 类，并重写了其中的 run() 方法
 */
public class ExtendsThread  extends Thread{

    @Override
    public void run() {
        System.out.println("用Thread类实现线程");
    }
}
