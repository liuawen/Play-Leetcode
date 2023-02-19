package cn.liuawen.ch02;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-25
 */
public class VolatileCanStop implements java.lang.Runnable  {

    private volatile boolean canceled = false;

    @Override
    public void run() {
        int num = 0;
        try {
            while (!canceled && num <= 1000000) {
                if (num % 10 == 0) {
                    System.out.println(num + "是10的倍数。");
                }
                num++;
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileCanStop r = new VolatileCanStop();
        Thread thread = new Thread(r);
        thread.start();
        Thread.sleep(3000);
//        Thread.sleep(1000);
        r.canceled = true;
    }
}