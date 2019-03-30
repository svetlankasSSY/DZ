
package massives;


public class massive6 {
    public static void main(String[] args) {
        int [] numbers = {5, 6, 1, 7, 2};
        int [] numbersCopy1 = numbers;
        numbersCopy1 [2] = 10;
        System.out.println("numbers[2]="+numbers[2]+ " numbersCopy1[2]=" + numbersCopy1[2]);
        int [] numbersCopy2 = new int[numbers.length];
        
    }
 
}
