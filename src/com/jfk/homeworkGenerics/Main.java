package com.jfk.homeworkGenerics;

import java.util.ArrayList;

public class Main {
    public static class FavoriteClasses<fav1, fav2, fav3> {
        private fav1 favorite1;
        private fav2 favorite2;
        private fav3 favorite3;

        public FavoriteClasses(fav1 favorite1, fav2 favorite2, fav3 favorite3) {
            this.favorite1 = favorite1;
            this.favorite2 = favorite2;
            this.favorite3 = favorite3;
        }

        public fav1 getFav1() {
            return (this.favorite1);
        }

        public fav2 getFav2() {
            return (this.favorite2);
        }

        public fav3 getFav3() {
            return (this.favorite3);
        }
    }

    public static void main(String[] args) {

        ArrayList<String> r = new ArrayList<>();

        FavoriteClasses<String, Integer, String> favoriteClasses = new FavoriteClasses("Hello", 67, r.get(0));

    }
}
