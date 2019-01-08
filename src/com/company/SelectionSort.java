package com.company;
import com.company.SortingUtil;

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        int m;
        for (int n=0;n<arr.length;n++){
            m=n;
            for (int i=n+1;i<arr.length;i++){
                if(arr[i]<arr[m]){
                    m=i;
                }
            }
            SortingUtil.swap(arr,m,n);
        }
        return arr;
    }
}
