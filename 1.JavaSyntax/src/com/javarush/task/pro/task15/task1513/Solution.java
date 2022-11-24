package com.javarush.task.pro.task15.task1513;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Зри в корень
1. Программа должна считать из консоли путь к файлу/папке.
2. Программа должна выводить в консоли диск, на котором находится этот файл (или папка).
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path root = Path.of(str);
        System.out.println(root.getRoot());
        //напишите тут ваш код
    }
}

