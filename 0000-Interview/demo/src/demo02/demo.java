package demo02;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2021-01-05
 */
public class demo {
    public static void main(String[] args) {
        String[] orderCodes= new String[5];
        for(int i=0;i<orderCodes.length;i++){
            orderCodes[i]="俄罗斯焦/日照港自提/背靠背sen'hai'";
        }
        for(int i=0;i<orderCodes.length;i++){
            orderCodes[i]=orderCodes[i].replaceAll("'", "''");
        }
        for(int i=0;i<orderCodes.length;i++){
            System.out.println(orderCodes[i]);
        }
    }
}
