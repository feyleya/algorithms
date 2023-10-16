package sorts;

import java.util.Arrays;

public class BinarySort {
    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearchRecursive(array, 0, array.length, 74));
    }

    private static int binarySearch(int[] array, int element){
        int startIdx = 0;
        int endIdx = array.length - 1;
        int middleIdx;

        while (startIdx <= endIdx){
            middleIdx = startIdx + (endIdx - startIdx) / 2;

            if (array[middleIdx] == element){
                return middleIdx;
            }
            if (array[middleIdx] > element){
                endIdx = middleIdx - 1;
            } else {
                startIdx = middleIdx + 1;
            }
        }
        return -1;
    }
    private static int binarySearchRecursive(int[] array, int start, int end, int element){
        if (end >= start){
            int middle = start + (end - start) / 2;

            if (array[middle] == element){
                return middle;
            }

            if (array[middle] > element){
                return binarySearchRecursive(array, start, middle - 1, end);
            }else {
                return binarySearchRecursive(array, middle + 1, end, element);
            }
        }
        return -1;
    }
}
