package com.jfk.generics;

public class Demo {


    public static void main(String[] args) {
//        DataHolder<Integer> holder = new DataHolder<>();
//        holder.setData(10);
//
//        Integer data = holder.getData();
//        System.out.println(data);
//
//        DataHolder<String> holderString = new DataHolder<>();
//        holderString.setData("rere");
//
//        DataHolder objectHolder = new DataHolder();
//        objectHolder.setData(4.5);

        DataHolder holder = new DataHolder("value");
//        System.out.println(holder.getValue());
        DataHolderInteger integer = new DataHolderInteger(20);
//        System.out.println(integer.getValue());

        DataHolderGeneric<Integer> generic = new DataHolderGeneric<>(20);
        DataHolderGeneric<String> genericString = new DataHolderGeneric<>("20");

        DataHolderGenericUsage usage = new DataHolderGenericUsage(generic);
        System.out.println("usage = " + usage);

        Pair<String, Integer> hovhannes = new Pair<>("Hovhannes", 21);
        Pair<String, Integer> arman = new Pair<>("Arman", 24);

        Pair<Pair<String, Integer>, Pair<String, Integer>> pair = new Pair<>(hovhannes, arman);
        String left = pair.getLeft().getLeft();


        LiteralGeneric<String> literalGeneric = new LiteralGeneric<>("123");
        LiteralGeneric<String> literalGenericSecond = new LiteralGeneric<>("123");

        String[] string = new String[]{"1223", "5556"};
        LiteralGenericArray<String> array = new LiteralGenericArray<>(string, literalGeneric);
        GenericWithSuper<Number> val = new GenericWithSuper<>(Double.valueOf("333"));
        GenericSuperWrapper value = new GenericSuperWrapper(val);

        GenericMethod builder = new GenericMethod();
        builder.setName("ffff");
        builder.display();
    }
}
