package com.jfk.generics;

public class DataHolderGenericUsage {

    private int value;

    public DataHolderGenericUsage(DataHolderGeneric<Integer> generic) {
        value = generic.getValue();
    }


    @Override
    public String toString() {
        return "DataHolderGenericUsage{" +
                "value=" + value +
                '}';
    }
}
