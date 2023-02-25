package ch07;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2023-02-04
 */
public class YieldExampleClient {

    public static void main(String[] args) {
        Thread xiaoming = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("小明--" + i);
                if (i == 2) {
                    Thread.yield();
                }
            }
        });
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        Thread jianguo = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("建国--" + i);
            }
        });

        xiaoming.start();
        jianguo.start();
    }
}