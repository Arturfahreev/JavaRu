package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла
Напиши код, который будет считывать с клавиатуры ссылку на файл в интернете, скачивать его и сохранять во временный файл.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        URL url = new URL(line);
        InputStream stream = url.openStream();
        byte[] arr = stream.readAllBytes();
        Path tempFile = Files.createTempFile(null, null);
        Files.write(tempFile, arr);

    }
}