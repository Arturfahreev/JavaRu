package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));

    }

    public static Month getNextMonth(Month month) {
        if (month.ordinal() < 11) {
            Month[] array = Month.values();
            int i = month.ordinal();
            Month m = array[i + 1];
            return m;
        } else {
            return Month.JANUARY;
        }



        //напишите тут ваш код
    }
}
