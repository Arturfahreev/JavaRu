package com.javarush.task.pro.task15.task1511;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем символы в файл
1. Программа должна считать из консоли путь к файлу.
2. Программа должна переписывать символы в файл.
3. Для записи символов должен быть использован BufferedWriter, который возвращается в результате вызова метода newBufferedWriter(Path) класса Files.*/

public class Solution {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             BufferedWriter bf = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
            bf.write(chars);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}


