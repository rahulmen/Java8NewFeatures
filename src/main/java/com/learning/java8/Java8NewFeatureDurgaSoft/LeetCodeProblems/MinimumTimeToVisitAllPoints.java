package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class MinimumTimeToVisitAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int minTime =0;
        if(points.length==1){
            return 0;
        }
        for(int i=0;i<points.length-1;i++){
            int[] num1 = points[i];
            int[] num2 = points[i+1];
            minTime=minSteps(num1,num2,minTime);
        }
        return minTime;
    }

    public int minSteps(int[] num1,int[] num2,int minSteps){
        int x1=num1[0];int y1= num1[1];
        int x2=num2[0];int y2=num2[1];
        while(x1!=x2 || y1!=y2){
            if(x1<x2 && y1<y2) {
                x1++;y1++;
                minSteps++;
            }else if(x1<x2 && y1>y2){
                x1++;y1--;
                minSteps++;
            }else if(x1>x2 && y1<y2){
                x1--;y1++;
                minSteps++;
            }
            else if(x1>x2 && y1>y2){
                x1--;y1--;
                minSteps++;
            }else if(x1==x2 && y1<y2){
                y1++;
                minSteps++;
            }
            else if(x1==x2 && y1>y2){
                y1--;
                minSteps++;
            }
            else if(y1==y2 && x1<x2){
                x1++;
                minSteps++;
            }
            else if(y1==y2 && x1>x2){
                x1--;
                minSteps++;
            }
        }
        return minSteps;
    }

    public int minTimeToVisitAllPoints1(int[][] points) {
        int minTime =0;
        for(int i=0;i<points.length-1;i++){
          minTime= minTime+Math.max(Math.abs(points[i+1][0]-points[i][0]),Math.abs(points[i+1][1]-points[i][1]));
        }
        return minTime;
    }

    public static void main(String[] args) {

        System.out.println(new MinimumTimeToVisitAllPoints().
                minTimeToVisitAllPoints1(new int[][]{{1,1},{3,4},{-1,0}}));
    }
}
