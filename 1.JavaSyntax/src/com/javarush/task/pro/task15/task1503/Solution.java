package com.javarush.task.pro.task15.task1503;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Если ресурсов много
Программа считывает с консоли путь к файлу, читает строки из файла и выводит их на экран.

*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try(Scanner scanner = new Scanner(System.in)) {
            String fileName = scanner.nextLine();

            try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(fileName))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

