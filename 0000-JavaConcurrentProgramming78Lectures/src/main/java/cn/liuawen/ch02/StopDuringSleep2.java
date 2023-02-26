package cn.liuawen.ch02;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-19
 */
public class StopDuringSleep2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable());
        thread.start();
        Thread.sleep(5);
        thread.interrupt();
    }
}
