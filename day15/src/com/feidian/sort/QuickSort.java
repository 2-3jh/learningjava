package com.feidian.sort;

public class QuickSort {
    public static void main(String[] args) {
        int []arr={6,1,2,7,9,3,4,5,10,8};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        int low=start+1;
        int high=end;
        if(start>=end)
            return ;
        while(low<high){
          while(true){
              if(low==high||arr[high]<arr[start]){
                  break;
              }
              high--;
          }
            while(true){
                if(low==high||arr[low]>arr[start]){
                    break;
                }
                low++;
            }

                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;

        }
        int temp=arr[low];
        arr[low]=arr[start];
        arr[start]=temp;
        quickSort(arr,start,low-1);
        quickSort(arr,low+1,end);
    }
}
