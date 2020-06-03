package Tasks_from_686_to_694;

import com.sun.deploy.security.SelectableSecurityManager;

public class Task_691 {
    public static void main(String[] args) {
        String dsc = "12.367865m";
        char[] chars = dsc.toCharArray();


        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i] <= 57) {
                System.out.println(1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 46) {
                System.out.println(2);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 46 || chars[i] > 57)
                System.out.println(3);
        }
    }
}
//        char[] chars = {'a', 'b', '1'};
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] >= 48 && chars[i] <= 57){
//                System.out.println(1);
//            }else if(chars[i] == 46){
//                System.out.println(2);
//            }else if(chars[i] >= 97 && chars[i] <= 122){
//                System.out.println(3);
//            }
//        }