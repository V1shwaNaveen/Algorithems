package findMultiples;
import java.util.Arrays;

public class TestQuestions {

    public static void main (String[]args){
        int[] arr = {5, 3, 8, 2, 6, 1};
        Arrays.sort(arr);
        int find = 4;
        boolean found = false;

        for(int num:arr){
            if(num == find){
                found = true;
            }else {
                found = false;
            }
        }
        if (found) {
            System.out.println("Number " + find + " was found in the array!");
        } else {
            System.out.println("Number " + find + " is missing from the array.");
        }

    }

}
