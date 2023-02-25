package ch07;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2023-02-04
 */
public class InterruptedClient {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for(int i=0; i<100 ;i++){
                System.out.println("I'm doing my work");
//原代码  System.out.println("I'm interrupted?"+Thread.currentThread().isInterrupted());
                System.out.println("I'm interrupted?"+Thread.interrupted());
            }
        });

        thread.start();
        Thread.sleep(1);
        thread.interrupt();
    }
}