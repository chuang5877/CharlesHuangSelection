package com.company;
import com.company.SelectionSort;

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        int m;
        for (int n=0;n<arr.length;n++){
            m=arr[n];
            for (int i=1;i<arr.length;i++){
                if(arr[i]<m){
                    SortingUtil.swap(arr,n,i);
                }
            }
        }
        return arr;
    }
}
