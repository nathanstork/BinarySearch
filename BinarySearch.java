import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    /*
    An algorithm that can find an element in a given array in O(n) time, using the information that the input array is sorted.
    The algorithm also calculates the running time after a successful run.
     */

    private int binarySearch(int[] inputArray, int element) {
        int low = 0; // the lowest index of the current interval
        int high = inputArray.length - 1; // the highest index of the current interval
        int time = 0; // used to measure the running time

        while (low <= high) {
            int middle = (low + high) / 2; // the middle index of the current interval
            time++;

            if (element < inputArray[middle]) {
                high = middle - 1;
            } else if (element > inputArray[middle]){
                low = middle + 1;
            } else { // inputArray[middle] == element
                System.out.println("The element is located at index " + middle + " of the array.");
                double rt = (double) time / inputArray.length; // the running time
                System.out.println("The running time was " + rt + "n.");
                return middle;
            }
        }

        System.out.println("The array does not contain that element.");
        return -1; // implies that the element is not in the array
    }
}
