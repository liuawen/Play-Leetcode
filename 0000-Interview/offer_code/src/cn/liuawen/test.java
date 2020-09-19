package cn.liuawen;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-18
 * 一来的时候搞错了
 * i++后 后加呗
 */
public class test {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i*i++;
        System.out.println("i=" + i);//4
        System.out.println("j=" + j);//1
        System.out.println("k=" + k);//11
    }
}
