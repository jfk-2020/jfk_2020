package Homework_201_210;

public class Task_204 {
    public static void main(String[] args) {
        int n = 21515434;
      int m = 0 ;
      for (int i = 1 ; i<= n; i*=10){
          m = n / i % 10;
          System.out.println(m);
      }
    }
}
