package Homework;

public class Task_60 {
    public static void main(String[] args) {
        int i = 897;
        int miansh = i % 10;
        int tasnavor = i % 100 / 10;
        int haryuravor = i / 100;

        int max, min, mid;

        if (miansh>=tasnavor){if(tasnavor>haryuravor){max= miansh;mid = tasnavor; min= haryuravor;}
        else {if (haryuravor >=miansh){max = haryuravor ; mid = miansh ; min = tasnavor;}
        else {max = miansh ; mid = haryuravor ; min = tasnavor;}}
            System.out.println(max);
            System.out.println(mid);
            System.out.println(min);
    }
        else {if(tasnavor>=haryuravor){if (haryuravor>=miansh){max = tasnavor; mid = haryuravor;min = miansh;}
        else {max  = tasnavor; mid = miansh ; min = haryuravor;}}
        else {max = haryuravor ; mid = tasnavor ; min = miansh;}
            System.out.println(max);
            System.out.println(mid);
            System.out.println(min);
        }
}
}
