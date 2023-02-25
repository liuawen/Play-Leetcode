package ch07;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2023-02-04
 */
public class InterruptSleepClient {
    public static void main(String[] args) throws InterruptedException {
        Thread xiaopang = new Thread(()->{
            for(int i=0; i<100 ;i++){
                System.out.println("I'm doing my work");
                try {
                    System.out.println("I will sleep");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("My sleeping was interrupted");
                }
                System.out.println("I'm interrupted?"+Thread.currentThread().isInterrupted());
            }
        });
        xiaopang.start();
        Thread.sleep(1);
        xiaopang.interrupt();
    }
}
