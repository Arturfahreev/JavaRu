package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
1. Программа должна считывать из консоли пути к файлам/директориям до тех пор, пока не будет введен некорректный путь.
2. Программа должна выводить в консоли информацию о введенном пути согласно условию.
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        while (Files.isRegularFile(Path.of(str)) | Files.isDirectory(Path.of(str))) {
            if (Files.isRegularFile(Path.of(str))) {
                System.out.println((Path.of(str)).toString() + THIS_IS_FILE);
                str = sc.nextLine();
            }
            else if (Files.isDirectory(Path.of(str))) {
                System.out.println((Path.of(str)).toString() + THIS_IS_DIR);
                str = sc.nextLine();
            }
                else break;

        }

    }
}

