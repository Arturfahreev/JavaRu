package com.javarush.task.pro.task15.task1522;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* 
Получение информации по API
Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, получать данные и выводить их на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        InputStream stream = url.openStream();
        byte[] arr = stream.readAllBytes();
        String str = new String(arr);
        System.out.println(str);
    }
}