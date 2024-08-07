package com.feidian.search;

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        int []arr ={7,23,79,81,103,127,131,147};
        System.out.println(binarySearch(arr, 147));
    }

    public static int binarySearch(int []arr,int number){
        int mid,min=0,max=arr.length-1;
        while(min<=max){
            mid=(max+min)/2;
            if(arr[mid]<number){
                min=mid+1;
            }else if(arr[mid]==number){
                return mid;
            }else{
                max=mid-1;
            }
        }
        //System.out.println("没有"+number);
        return -1;
    }
}
