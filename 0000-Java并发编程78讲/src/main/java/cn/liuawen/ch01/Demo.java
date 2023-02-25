package cn.liuawen.ch01;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-19
 */
public class Demo {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
        //Thread-0

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        /**
         *
         */
/*        Thread-0
        Thread-1*/

    }
}
