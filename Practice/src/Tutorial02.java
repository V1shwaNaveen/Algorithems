package findMultiples;

import java.util.Arrays;

public class Tutorial02 {
    public static void main(String[] args) {
        int[] Numbers = {2, 7, 4, 0, 3, 2, 5, 1, 0, 3};
        Arrays.sort(Numbers);

        int find = 3;

        int first = 0;
        int last = Numbers.length - 1;
        boolean found = false;  // Keep track of whether we found the number

        while (first <= last) {
            int middle = (first + last) / 2;

            if (Numbers[middle] == find) {
                found = true;
                break;  // Exit loop early since we found it
            } else if (Numbers[middle] < find) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }

        if (found) {
            System.out.println("Number " + find + " was found in the array!");
        } else {
            System.out.println("Number " + find + " is missing from the array.");
        }
    }
}
