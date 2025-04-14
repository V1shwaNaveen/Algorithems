package findMultiples;

public class Linear {
    public static void main(String[]args){
        boolean found = false;
        int find = 8;
        int[] arr = {5, 3, 8, 2, 6, 1, 7, 12, 10, 15, 13, 20, 9};

        for (int i = 0; i<arr.length; i++){
            if(arr[i]==find){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Found the number");
        }else {
            System.out.println("Number not found.");
        }
    }
}
