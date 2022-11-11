package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
считывает из консоли имя текстового файла, далее читает символы из этого файла (используй метод readAllLines(Path) класса Files)
и выводит на экран все, за исключением точки, запятой и пробела.
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            Path src = Path.of(str);
            List<String> arr = Files.readAllLines(src);
            for (int i = 0; i < arr.size(); i++) {
                String value = arr.get(i);
                char[] arr2 = value.toCharArray();
                for (int j = 0; j < arr2.length; j++) {
                    if ((arr2[j] == ',') || (arr2[j] == '.') || (Character.isWhitespace(arr2[j])) ) {
                        continue;
                    } else System.out.print(arr2[j]);

                }

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}

