
package massives;

import java.util.Arrays;


public class Arifmeti4eskoe {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        for (int i = 0; i < 5; i++) {
            mas1[i] = (int) (Math.random() * 6); 
            mas2[i] = (int) (Math.random() * 6);
        }
        System.out.println("mas1 " + Arrays.toString(mas1));
        System.out.println("mas2 " + Arrays.toString(mas2));
        double average1 = 0; //srednee1
        double average2 = 0;
        for (int i = 0; i < 5; i++) {  //nahodim summu vseh elementov massiva 4erez cikl for
            average1 += mas1[i];
            average2 += mas2[i];
        }
        average1/=mas1.length;  //nahodim srednee arifmeti4eskoe
        average2/=mas2.length;
       // proverka 4erez if
       
       if(average1 > average2){
           System.out.println("Среднее арифметическое 1-го массива("+average1+") больше среднего арифметического второго массива("+average2+")");
       }else if(average1 < average2){
             System.out.println("Среднее арифметическое 1-го массива("+average1+") меньше среднего арифметического второго массива("+average2+")");
       }else{System.out.println("Средние арифметические массивов равны ("+average1+") = ("+average2+")");
           
       }
    }
}
