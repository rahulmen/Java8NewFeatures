package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class MinTimeVisitingAllPoints {

        public int minTimeToVisitAllPoints(int[][] points) {

            int count = 0;

            for(int i=0;i<points.length-1;i++){
                int[] temp1 = points[i];
                int[] temp2 = points[i+1];
                int x1 = temp1[0];
                int y1 = temp1[1];
                int x2 = temp2[0];
                int y2 = temp2[1];

                while(x1!=x2 || y1!=y2){
                    if(x1!=x2 && y1!=y2){
                        if(x1<x2 && y1<y2){
                            x1++;y1++;
                        }else if(x1>x2 && y1<y2){
                            x1--;y1++;
                        }else if(x1<x2 && y1>y2){
                            x1++;y1--;
                        }else{
                            x1--;y1--;
                        }
                    }else if (x1!=x2){
                        if(x1<x2){
                            x1++;
                        }else{
                            x1--;
                        }
                    }else{
                        if(y1<y2){
                            y1++;
                        }else {
                            y1--;
                        }
                    }
                    count++;
                }
            }
            return count;
        }


    public static void main(String[] args) {

        System.out.println(new MinTimeVisitingAllPoints().minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}}));


    }
}
