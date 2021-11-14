package com.company;

import java.util.*;
public class Main {
    static void reverse(int []arr, int n){
        int i;
        if(n>0){
            i = n-1;
            System.out.print(arr[i]+" ");
            reverse(arr,i);
        }
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < 5; i++) {
            arr[i] = obj.nextInt();
        }

        reverse(arr,n);
        obj.close();
    }

}
