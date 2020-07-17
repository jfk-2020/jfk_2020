package Generics;

public class FavoriteClasses<T, K, Y> {
    private T favorite1;
    private K favorite2;
    private Y favorite3;
    public FavoriteClasses (T fav1, K fav2, Y fav3){
        this.favorite1=fav1;
        this.favorite2=fav2;
        this.favorite3=fav3;
    }
    public T getFav1(){
        return(this.favorite1);
    }
    public K getFav2(){
        return(this.favorite2);
    }
    public Y getFav3(){
        return(this.favorite3);
    }
}
