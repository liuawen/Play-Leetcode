package Q07;

import java.util.HashMap;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-12
 */
public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        HashMap<String, String> map2 = new HashMap();
        map.put("张三", "我是张三的测试数据");
        map.put("张三", "我是张三三的测试数据");
        System.out.println(map.get("张三"));// key一样 覆盖掉了

    }
}
