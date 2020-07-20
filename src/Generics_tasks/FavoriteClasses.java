package Generics_tasks;

public class FavoriteClasses<T, F, X> {

    private T favorite1;
    private F favorite2;
    private X favorite3;

    public FavoriteClasses(T fav1, F fav2, X fav3) {
        this.favorite1 = fav1;
        this.favorite2 = fav2;
        this.favorite3 = fav3;
    }

    public T getFav1() {
        return (this.favorite1);
    }

    public F getFav2() {
        return (this.favorite2);
    }

    public X getFav3() {
        return (this.favorite3);
    }
}
