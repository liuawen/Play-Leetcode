package cn.liuawen.ch01;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-24
 * 实现Runnable接口 实现多线程
 * 首先通过 RunnableThread 类实现 Runnable 接口，
 * 然后重写 run() 方法，
 * 之后只需要把这个实现了 run() 方法的实例传到 Thread 类中就可以实现多线程。
 */
public class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("用实现Runnable接口实现线程");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new RunnableThread());
        t.start();
    }
}
