package cn.liuawen.ch03;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-19
 */
public class Demo {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableDemo());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.interrupt();
        System.out.println(thread.getState());
    }
}
