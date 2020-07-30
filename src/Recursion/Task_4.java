package Recursion;

public class Task_4 {
    public static void main(String[] args) {
        int[] ints = {3, 8, 7, 5, 5, 7, 8, 3};
        int res= getresult(ints,0,0);
        System.out.println(res);
    }

    public static int getresult (int []array , int index,int result){
        if (array.length / 2 == index){return result = 1; }else
        {if (array[array.length-1-index]==array[index]){return getresult(array,++index,result); }else
        {return result = 0;}
        }
    }
}
