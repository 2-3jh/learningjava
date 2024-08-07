package com.feidian.sort;

public class InsertDemo {
    public static void main(String[] args) {
        int []arr={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        arr=insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] insertSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i+1];
            int j;
            for(j=i;j>-1;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
                arr[j+1]=temp;

        }
        return arr;
    }
}
