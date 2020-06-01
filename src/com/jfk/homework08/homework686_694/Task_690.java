package com.jfk.homework08.homework686_694;

public class Task_690 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'T', 'R', 'h', 'L', 'G'};

        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 97 && chars[i] <= 122){
                chars[i] = (char) (chars[i] - 32);
            }else if(chars[i] >= 65 && chars[i] <= 90){
                chars[i] = (char) (chars[i] + 32);
            }
        }
        System.out.println(chars);
    }
}
