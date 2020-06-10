package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

import java.util.Arrays;

public class IslandPremiter {


    public int islandPerimeter(int[][] grid) {

        int count =0;


        if(grid.length==1){

        }

        for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid.length;j++){
               if(grid[i][j]==0){
                   continue;
               }else{
                   if(i==0 && j==0){
                       count = count + (4 - (grid[i + 1][j] + grid[i][j + 1]));
                   }
                   else if(i==grid.length-1 && j==grid.length-1){
                       count = count + (4 - (grid[i - 1][j]+grid[i][j - 1]));
                   }
                   else if (i==grid.length-1 && j!=grid.length-1){
                       if(j==0){
                           count = count + (4 - (grid[i - 1][j] + grid[i][j + 1]));
                       }else{
                           count = count + (4 - (grid[i - 1][j] + grid[i][j + 1]+grid[i][j - 1]));

                       }

                   }else if(j==grid.length-1 && i!=grid.length-1){
                       if(i==0) {
                           count = count + (4 - (grid[i + 1][j] + grid[i][j - 1]));
                       }else{
                           count = count + (4 - (grid[i + 1][j] + grid[i][j - 1] + grid[i - 1][j]));

                       }
                   }
                   else if (i==0 && j!=0){
                       count = count + (4 - (grid[i + 1][j] + grid[i][j + 1]+grid[i][j -1]));
                   }else if(i!=0 && j==0){
                       count = count + (4 - (grid[i + 1][j] + grid[i -1][j] + grid[i][j + 1]));
                   }else if(i!=0 && j!=0){
                       count = count + (4 - (grid[i + 1][j] + grid[i -1][j] + grid[i][j + 1]+ grid[i][j - 1]));
                   }

               }
           }
        }

        return count;

    }

    public static void main(String[] args) {

        int[] nums = {1,4,3,2};
        Arrays.sort(nums);

        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=Math.min(nums[i],nums[i+1]);
        }
        System.out.println(sum);
    }
}
