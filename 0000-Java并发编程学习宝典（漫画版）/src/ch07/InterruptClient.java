package ch07;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2023-02-04
 */
public class InterruptClient {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for(int i=0; i<100 ;i++){
                System.out.println("I'm doing my work."+i);
                System.out.println("I'm interrupted?"+Thread.currentThread().isInterrupted());
            }
        });
        thread.start();
        System.out.println(Thread.currentThread().isInterrupted());
        System.out.println("start");
        Thread.sleep(1);
        System.out.println("sleep");
        thread.interrupt();
        System.out.println("interrupt");
    }
}
