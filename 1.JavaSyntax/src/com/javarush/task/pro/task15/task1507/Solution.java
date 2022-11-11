package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
1. Программа должна считать из консоли путь к файлу.
Считывает из консоли имя текстового файла, далее читает строки из этого файла (используй метод readAllLines(Path) класса Files)
и выводит их на экран через одну, начиная с первой.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            List<String> list = Files.readAllLines(Path.of(sc.nextLine()));
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                if (i == 0 || i % 2 == 0) System.out.println(str);
            }

        } catch (IOException exc) {
            System.out.println(exc);
        }
        //напишите тут ваш код
    }
}

