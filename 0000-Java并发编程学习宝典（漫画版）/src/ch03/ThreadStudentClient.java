package ch03;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-24
 */
public class ThreadStudentClient {
    public static void main(String[] args) {
        Punishment punishment = new Punishment(100,"internationalization");
        ThreadStudent threadStudent = new ThreadStudent("小明",punishment);
//        threadStudent.start();
//        threadStudent.copyWord();

        ThreadStudent xiaoming = new ThreadStudent("小明",punishment);
        xiaoming.start();

        ThreadStudent xiaozhang = new ThreadStudent("小张",punishment);
        xiaozhang.start();

        ThreadStudent xiaoZhao = new ThreadStudent("小赵",punishment);
        xiaoZhao.start();
        System.out.println("Another thread will finish the punishment。 main thread is finished" );

    }
}
