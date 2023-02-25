package cn.liuawen.ch02;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-19
 */
public class Runnable implements java.lang.Runnable {
    @Override
    public  void  run() {
        int num = 0;
        while (!Thread.currentThread().isInterrupted() && num <= 1000) {
            System.out.println(num);
            num++;
            try {
                Thread.sleep(1000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
