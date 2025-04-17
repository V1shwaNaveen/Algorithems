package findMultiples;

public class SelectionSort{

    // selection sort = search through an array and keep track of the minimum value during
    //			         each iteration. At the end of each iteration, we swap values.

    //				 Quadratic time O(n^2)
    //				 small data set = okay
    //				 large data set = BAD

    public static void main(String[] args) {

        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort(array);

        for(int i : array) {
            System.out.print(i);
        }

        binarySearch(array);
        linearSearch(array);
    }

    public static void selectionSort(int[]array){
        for (int i = 0; i<array.length-1;i++){
            int min = i;
            for (int j = i+1; j<array.length;j++){
                if(array[min]>array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void binarySearch(int[]array){
        int find = 1;
        boolean found = false;
        int first = 0;
        int last = array.length-1;

        while (first<=last){
            int middle = (first+last)/2;
            if (array[middle]==find){
                found = true;
                break;
            } else if (array[middle]>find) {
                last = middle-1;
            } else {
                first = middle+1;
            }
        }
        if (found){
            System.out.println("Found the number");
        }else {
            System.out.println("Couldn't find the number");
        }
    }
    public static void linearSearch(int[]array){
        int find = 4;
        boolean found = false;

        for (int num : array){
            if (num == find){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Found the number Linear");
        }

    }


}