package cn.liuawen.y2021.m03.d18;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2021-03-18
 */
public class Hello {
    public static void main(String[] args) {
        String url = "http://192.168.8.208:8199/TIMS-Server/cMImageController/getImageByNologin.action?file_id=80401202102260000000003804000003&amp;ext=pdf";
        String suffix = getNameSuffix(url);//获取当前影像的后缀
        StringBuilder imageNamePathSb= new StringBuilder();
        imageNamePathSb.append("aaa").append(String.valueOf(numberAddZero(11))).append(".").append(suffix);
        System.out.println(suffix);
        System.out.println(imageNamePathSb);
        String urlpath = url;
        int suffixIndex = urlpath.lastIndexOf("ext=");
        String suffix1 = "";
        if (suffixIndex >= 0) {
            suffix1 = new StringBuilder().append(".")
                    .append(urlpath.substring(suffixIndex + 4))
                    .toString();
        }
        System.out.println(suffix1);
    }
    /**
     * 数字补0
     *
     * @param i
     * @return
     */
    private static String numberAddZero(int i) {
        if (i < 10) {
            return "00" + i;
        } else if (i > 9 && i < 100) {
            return "0" + i;
        } else {
            return String.valueOf(i);
        }
    }    /**
     * 获取url的后缀
     * @param url  "http://aaaa?bbb=444&ext=jpg&hhh=555" ext 所跟随的是文件名后缀
     * @return
     */
    private static   String getNameSuffix(String url){
        String[] str1 = url.split("\\?");
        String[] str2 = str1[1].split("&");
        for (int i = 0; i < str2.length; i++) {
            String[] str = str2[i].split("=");
            for (int j = 0; j < str.length; j++) {
                if("ext".equals(str[0])){
                    return str[1];
                }
            }
        }
        return "";
    }
}
