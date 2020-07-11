package com.jfk.generics;

public class Demo {


    public static void main(String[] args) {
        DataHolder<Integer> holder = new DataHolder<>();
        holder.setData(10);

        Integer data = holder.getData();
        System.out.println(data);

        DataHolder<String> holderString = new DataHolder<>();
        holderString.setData("rere");

        DataHolder objectHolder = new DataHolder();
        objectHolder.setData(4.5);

    }
}
