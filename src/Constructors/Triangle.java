package Constructors;

public class Triangle {

        private int a;
        private int b ;
        private int c ;
        private int h;
        private double alfa ;
        private double betta ;
        private double gamma ;


        public Triangle (int sideA,int sideB , int sideC , int high){
            a = sideA;
            b = sideB;
            c = sideC;
            h = high;
        }
        public Triangle (double angleA , double angleB , double angleG){
            alfa = angleA;
            betta = angleB ;
            gamma = angleG;
        }

        public int volume (){
            return c * h / 2;
        }

        public int length (){
            return a + b + c;
        }

        public double volumeWithAngle (){return a * b * Math.sin(alfa) / 2;}
        public double volumeWithlength (){int p = (a+b+c)/2 ;
        return p*Math.sqrt((p-a)*(p-b)*(p-c));
        }

    }

