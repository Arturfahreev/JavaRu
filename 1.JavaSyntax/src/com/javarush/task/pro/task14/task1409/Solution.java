package com.javarush.task.pro.task14.task1409;

/* 
Пропускаем сквозь себя
1. В методе main не должно быть блока try-catch.
2. Метод main должен бросать исключение.
3. Метод main должен вызывать метод generateLuckyNumber().
4. Метод generateLuckyNumber изменять нельзя.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не повезло");
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}
