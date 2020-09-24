package cn.liuawen.single;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-19
 */
public class Singleton5 {
    private static Singleton5 instance;
    private Singleton5(){

    }
    public static Singleton5 getInstance(){
		if(instance == null){
        //同步
        //不是最优版本  后面线程不需要的 已经new了 安全问题已经解决了  锁  有人有用了 直接用
        synchronized (Singleton5.class){
            if (instance==null){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new Singleton5();
            }
        }}

        return instance;
    }
}
