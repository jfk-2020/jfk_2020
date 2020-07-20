package com.jfk.lesson23Generics;

public class GenericMain {
    public static class FavoriteClasses<T, S, V>{
        private T favorite1;
        private S favorite2;
        private V favorite3;
        FavoriteClasses(T fav1, S fav2, V fav3){
            this.favorite1=fav1;
            this.favorite2=fav2;
            this.favorite3=fav3;
        }
        public T getFav1(){
            return this.favorite1;
        }
        public S getFav2(){
            return this.favorite2;
        }
        public V getFav3(){
            return this.favorite3;
        }
    }
    public static void main(String[] args){

        FavoriteClasses<String, Integer, Double> a = new FavoriteClasses("Hello",67,5.7);

    }
}
