package junte.customview;

/**
 * Created by liupeiyang on 2018/2/24.
 */

public class Tools {


    /**
     * <br> Description: 判断一个字符串是否为空
     * <br> Author:      liupeiyang
     * <br> Date:        2018/2/24 14:12
     */
    public static boolean isEmpty(String str) {
        if ((str == null) || (str.equals("") || (str.trim().length() == 0)) || str.equals("null")) {
            return true;
        }
        return false;
    }


}
