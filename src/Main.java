import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Primitive type
        long viewCounts = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEnable = false;

        // Reference type
        Date date = new Date();
        String myName = "Braya Cheat.";
        int[][] numbers = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        // System.out.println(Arrays.deepToString(numbers));
        final float pi = 3.14F;

        // Arithmetic
        // type casting while calculate
        //double result = (double)10 / (double)3;
        //int x = 1;
        // y will be 1 because it copy x before increment
        //int y = x++;
        // y will be 2 because it increment before copy
        //int y = ++x;

        // Order of operator
        // () -> high prio
        // */ -> mid prio
        // + - -> low prio
        double test = 1.1;
        int[] arr = {9,7,5,11,32,5,6};
        Main main = new Main();
        System.out.println("Find max: " + main.findMax(arr));
        System.out.println("Find min: " + main.findMin(arr));
    }

    public int findMax(int[] arr) {
        if(arr == null || arr.length == 0) return Integer.MAX_VALUE;
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }

    public int findMin(int[] arr) {
        if(arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}