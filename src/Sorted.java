import java.util.Scanner;

public class Sorted {
    static boolean isSorted( int[] arr, int n){
        if(arr == null || n <= 1){
            return true;
        }
        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }

        System.out.print(isSorted(arr,n));
    }

}

