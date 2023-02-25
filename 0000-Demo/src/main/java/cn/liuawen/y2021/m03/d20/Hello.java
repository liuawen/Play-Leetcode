package cn.liuawen.y2021.m03.d20;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2021-03-18
 */
public class Hello {
    public static void main(String[] args) {
        //不是这样的-128  127的
        Integer a = -128;
        int aa = -128;
        System.out.println(a==aa);
        Integer b = 127;
        int bb = 127;
        System.out.println(b==bb);
        Integer c = 128;
        int cc = 128;
        System.out.println(c==cc);
        System.out.println(c.equals(cc));
    }
}
