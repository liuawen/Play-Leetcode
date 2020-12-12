package demo01;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-12-01
 */
public class demo {
    public static void main(String[] args) {
        Set<String> deptVSet = new HashSet<String>();
        deptVSet.add("a");
        deptVSet.add("a");
        deptVSet.add("a");
        System.out.println(deptVSet.toArray(new String[0]));
    }
}
