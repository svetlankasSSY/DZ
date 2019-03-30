
package massives;

import java.util.Arrays;


public class Arifmati4eskoe2 {
   public static void main(String[] args) {
        int[] mas1 = new int[20];
        for (int i = 0; i < 20; i++) {
            mas1[i] = (int) (Math.random() * 21);
        }
        System.out.println("mas1 " + Arrays.toString(mas1));
         int max = 0;

      // Перебираем все элементы массива.
      for (int i = 1; i < mas1.length; i++) {
          // Сравниваем значение переменной max со значениями элемента массива.
          // Если значение элемента массива больше значения переменной max,
          // то новое значение переменной max будет равно значению этого элемента.
          max = Math.max(max, mas1[i]);
          }
      }

      // Выводим на экран наибольший элемент массива myArray.
      System.out.println("Максимальное значение в массиве mas1: " + max);
   }
        /*int min = Math.min(0, 20);
        int max = Math.max(0, 20);
        System.out.println(min);
        System.out.println(max);*/
         
         // Вывод четных элементов массива на экран.
      System.out.print("Четные элементы массива: ");
      for (int i = 0; i < mas1.length; i++) {
         if(mas1[i]%2 == 0){
             System.out.print(mas1[i] + ", ");
         }
      }
        
       double average1 = 0; //srednee
        for (int i = 0; i < 20; i++) {  //nahodim summu vseh elementov massiva 4erez cikl for
            average1 += mas1[i];
        }
        
        average1 /= mas1.length;  //nahodim srednee arifmeti4eskoe
        System.out.println("Среднее арифметическое массива равно("+average1+")");
    }
    
    
} 
