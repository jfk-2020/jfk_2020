package Constructors;

public class Triangle {

        private int a;
        private int b ;
        private int c ;
        private int h;

        public Triangle (int sideA,int sideB , int sideC , int high){
            a = sideA;
            b = sideB;
            c = sideC;
            h = high;
        }

        public double volume (){
            return c * h / 2;
        }

        public int length (){
            return a + b + c;
        }



    }

