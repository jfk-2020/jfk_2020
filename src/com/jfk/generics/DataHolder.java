package com.jfk.generics;

public class DataHolder<T> {

    private T data;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //FileInputStream
    //FileOutputStream
    //FileReader
    //BufferedOutputStream
    //Create class to provide functionality save file with specific name and extension.
    //And add ability to read file as String and display content
}
