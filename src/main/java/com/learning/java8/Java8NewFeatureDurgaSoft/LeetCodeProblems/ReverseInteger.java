package com.learning.java8.Java8NewFeatureDurgaSoft.LeetCodeProblems;

public class ReverseInteger {

    public Long reversedd(int x) {
        String number ="";
        boolean isNegative = false;
        if(x<0){
            x = Math.abs(x);
            isNegative=true;
        }
        int temp = x;
        while(temp>9) {
            int reminder = temp % 10;
            number = number+reminder;
            temp = (temp - reminder) / 10;
        }
        number=number+temp;
        if(isNegative==true){
           return Long.parseLong("-"+number);
        }else{
            return Long.parseLong(number);
        }
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {

        System.out.println(new ReverseInteger().reverse(-56767));


    }
}
