package findMultiples;

import java.util.Arrays;

public class TestQuestion02 {
    public static void main(String[]args){

        int find = 6;
        boolean found = false;
        int[]arr = {5, 3, 8, 2, 6, 1,7,12,10,15,13,20,9};
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length-1;

        while (first<=last){
        int middle = (first+last)/2;
        if(arr[middle]==find){
            found = true;
            break;
        } else if (arr[middle]>find) {
            last = middle - 1;
        }else {
            first = middle+1;
        }
        }
        if (found) {
            System.out.println("Found the number: " + find);
        } else {
            System.out.println("Couldn't find the number!");
        }
    }
}
