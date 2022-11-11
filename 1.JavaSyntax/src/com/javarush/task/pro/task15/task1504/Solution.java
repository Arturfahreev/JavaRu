package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
считывает с консоли путь к файлу1 и путь к файлу2. Далее все байты из файла1 записывает в файл2, но при этом меняет их местами по такому принципу: первый со вторым, третий с четвертым, и т.д.
Если последний байт в файле1 нечетный, то пишем его в файл2 как есть. Для чтения и записи файлов используй методы newInputStream и newOutputStream класса Files.


*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String dest = sc.nextLine();

        try (InputStream inputStream = Files.newInputStream((Path.of(src)));
            OutputStream outputStream = Files.newOutputStream(Path.of(dest))) {
            while (inputStream.available() > 0) {
                byte[] buffer = new byte[512];
                int real = inputStream.read(buffer);
                if (real % 2 == 0) {
                    for (int i = 0; i < real; i += 2) {
                        byte t = buffer[i];
                        buffer[i] = buffer[i + 1];
                        buffer[i + 1] = t;
                    }
                    outputStream.write(buffer, 0, real);
                } else {
                    int j = 0;
                    for (int i = 0; j < real / 2; i += 2, j++ ) {
                        byte t = buffer[i];
                        buffer[i] = buffer[i + 1];
                        buffer[i + 1] = t;
                    }
                    outputStream.write(buffer, 0, real);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //напишите тут ваш код
    }
}

