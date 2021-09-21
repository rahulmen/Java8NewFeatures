package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class TolToe {

        public String tictactoe(int[][] moves) {

            char[][] arr = new char[3][3];

            boolean isA_win = false;
            boolean isB_win = false;
            boolean isPending = false;

            boolean swit = false;
            for(int[] i:moves){
                if(swit == false){
                    arr[i[0]][i[1]] = 'X';
                    swit = true;
                }else{
                    arr[i[0]][i[1]] = 'O';
                    swit = false;
                }
            }


            if((arr[0][0] == arr[1][1] && arr[1][1]==arr[2][2] && arr[0][0]=='X') ||
                    (arr[0][2] == arr[1][1] && arr[1][1]==arr[2][0] && arr[0][2]=='X') ||
                    (arr[0][0] == arr[0][1] && arr[0][1]==arr[0][2] && arr[0][0]=='X') ||
                    (arr[1][0] == arr[1][1] && arr[1][1]==arr[1][2] && arr[1][0]=='X') ||
                    (arr[2][0] == arr[2][1] && arr[2][1]==arr[2][2] && arr[2][0]=='X') ||
                    (arr[0][0] == arr[1][0] && arr[1][0]==arr[2][0] && arr[0][0]=='X') ||
                    (arr[0][1] == arr[1][1] && arr[1][1]==arr[2][1] && arr[0][1]=='X') ||
                    (arr[0][2] == arr[1][2] && arr[1][2]==arr[2][2] && arr[0][2]=='X'))
                isA_win = true;
            else if((arr[0][0] == arr[1][1] && arr[1][1]==arr[2][2] && arr[0][0]=='O') ||
                    (arr[0][2] == arr[1][1] && arr[1][1]==arr[2][0] && arr[0][2]=='O') ||
                    (arr[0][0] == arr[0][1] && arr[0][1]==arr[0][2] && arr[0][0]=='O') ||
                    (arr[1][0] == arr[1][1] && arr[1][1]==arr[1][2] && arr[1][0]=='O') ||
                    (arr[2][0] == arr[2][1] && arr[2][1]==arr[2][2] && arr[2][0]=='O') ||
                    (arr[0][0] == arr[1][0] && arr[1][0]==arr[2][0] && arr[0][0]=='O') ||
                    (arr[0][1] == arr[1][1] && arr[1][1]==arr[2][1] && arr[0][1]=='O') ||
                    (arr[0][2] == arr[1][2] && arr[1][2]==arr[2][2] && arr[0][2]=='O'))
                isB_win = true;

            if((arr[0][0] != 'X' &&  arr[0][0] != 'O')
                    || (arr[0][1] != 'X' &&  arr[0][1] != 'O')
                    || (arr[0][2] != 'X' &&  arr[0][2] != 'O')
                    || (arr[1][0] != 'X' &&  arr[1][0] != 'O')
                    || (arr[1][1] != 'X' &&  arr[1][1] != 'O')
                    || (arr[1][2] != 'X' &&  arr[1][2] != 'O')
                    || (arr[2][0] != 'X' &&  arr[2][0] != 'O')
                    || (arr[2][1] != 'X' &&  arr[2][1] != 'O')
                    || (arr[2][2] != 'X' &&  arr[2][2] != 'O'))
                isPending = true;

            if ((isA_win == true && isB_win == true) || (isA_win == true && isB_win == false))
                return "A";
            else if (isB_win == true)
                return "B";
            else if (isPending == true)
                return "Pending";
            else
                return "Draw";
        }

    public static void main(String[] args) {
            int[][] arr = {{2,0},{1,1},{0,2},{2,1},{1,2},{1,0},{0,0},{0,1}};
        System.out.println(new TolToe().tictactoe(arr));
    }

}

