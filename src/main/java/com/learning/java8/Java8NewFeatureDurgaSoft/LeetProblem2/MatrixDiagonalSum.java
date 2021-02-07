package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem2;

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int j1 = 0;int j2 = mat.length-1;
        int sum=0;
        boolean isPositive = true;
        for(int i=0;i<mat.length;i++){
            if(j2==j1){
                isPositive = false;
            }
            if(j1 == j2 && mat.length%2!=0){
                sum+=mat[i][j1];
            }else{
                sum+=mat[i][j1]+mat[i][j2];
            }
            if(isPositive == true){
                j1++;j2--;
            }else{
                j1--;j2++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        //[[1,2,3],[4,5,6],[7,8,9]]
        System.out.println(new MatrixDiagonalSum().diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));

    }
}
