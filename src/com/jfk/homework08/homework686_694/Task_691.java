package com.jfk.homework08.homework686_694;

public class Task_691 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', '1'};
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= 48 && chars[i] <= 57){
                System.out.println(1);
            }else if(chars[i] == 46){
                System.out.println(2);
            }else if(chars[i] >= 97 && chars[i] <= 122){
                System.out.println(3);
            }
        }
    }
}
