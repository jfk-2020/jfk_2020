package com.jfk.generics;

public class GenericSuperWrapper {


    private GenericWithSuper<? super Integer> val;

    public GenericSuperWrapper(GenericWithSuper<? super Integer> val) {
        this.val = val;
    }
}
