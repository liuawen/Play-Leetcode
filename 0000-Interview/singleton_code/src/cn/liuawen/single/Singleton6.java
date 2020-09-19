package cn.liuawen.single;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-19
 * 静态内部类
 * 在内部类被加载初始化时，才创建这个INSTANCE实例对象
 * 调用的时候创建
 *
 * 静态内部类不会随着外部类的加载和初始化而初始化的  它是要单独去加载初始化的
 * 用的时候  加载   延迟初始化加载   线程安全  类加载器
 * 因为是内部类加载和初始化时 创建  因此是线程安全的
 */
public class Singleton6 {
    private Singleton6(){

    }
    private static class Inner{
        private static final Singleton6 INSTANCE = new Singleton6();
    }
    public static Singleton6 getInstance(){
        return Inner.INSTANCE;
    }
}
