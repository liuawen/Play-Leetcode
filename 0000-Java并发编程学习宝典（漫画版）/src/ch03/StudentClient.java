package ch03;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-24
 */
public class StudentClient {
    public static void main(String[] args) {
        Punishment punishment = new Punishment(100,"internationalization");
        Student student = new Student("小明",punishment);
        student.copyWord();
        //main函数所在的线程
        //main线程-小明一共抄写了100次！
    }
}
