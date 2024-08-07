package com.feidian.code;

public class Test7 {
    public static void main(String[] args) {
       int[][]cost={{22,66,44},
               {77,33,88},
               {25,45,65},
               {11,66,99}};

       int yearSum =0;
        for (int i = 0; i < cost.length; i++) {
            int seaonSum=0;
            for (int j = 0; j < cost[i].length; j++) {
                seaonSum+=cost[i][j];
            }
            System.out.println("第"+(i+1)+"季度营业额"+seaonSum+"万元");
            yearSum +=seaonSum;
        }
        System.out.println("全年营业额"+ yearSum +"万元");
    }
}
