package findMultiples;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[]args) {
        int find = 9;
        boolean found = false;
        int[] arr = {5, 3, 8, 2, 6, 1, 7, 12, 10, 15, 13, 20, 9};
        Arrays.sort(arr);

        int first = 0;
        int last = arr.length - 1;

        while (first<last){
            int middle = (first+last)/2;
            if(arr[middle] == find){
                found = true;
                break;
            } else if (arr[middle]>find) {
                first = middle+1;
            } else {
                last = middle-1;
            }
        }
    }
}
