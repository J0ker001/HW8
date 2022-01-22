package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void definitionYear(int x) {


        if ((x % 400 == 0 && x % 100 != 0) || (x % 4 == 0)) {
            System.out.println(x + " является високосным годом");
        } else
            System.out.println(x + " не является високосным годом");
    }


    public static void programSelectionIos(int iOs, int yearOfRelease) {


        if (iOs == 0 && yearOfRelease >= 2022) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (iOs == 0 && yearOfRelease < 2022) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static void programSelectionAndroid(int android, int yearOfRelease) {

        if (android == 1 && yearOfRelease >= 2022) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (android == 1 && yearOfRelease < 2022) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static String deliver(int distance) {
        String deliveriOneDay = "Дней доставки : 1";
        String deliveriTwoDay = "Дней доставки : 2";
        String deliveriThreeDay = "Дней доставки : 3";


        if (distance <= 20) {
            return deliveriOneDay;
        } else if (distance >= 20 && distance <= 60) {
            return deliveriTwoDay;

        } else if (distance >= 60 && distance <= 100) {
            return deliveriThreeDay;
        }
        return "так далеко не доставляем";
    }


    public static void checkingDuplicates(String duplicates) {

        char[] chars = duplicates.toCharArray();

        for (int i = 0; i < duplicates.length(); i++) {
            for (int j = i + 1; j < duplicates.length(); j++) {
                if (chars[i] == chars[j] && j < duplicates.length()) {
                    System.out.println(j + "ый(ой) символ {" + chars[j] + "} в дубле ");
                }
            }
        }notDuplicates(); return;
            }
            public static void notDuplicates (){
                System.out.println("Нет дублей");
            }





public static void reverse(int [] arr){

        for (int i = arr.length - 1; i >= 0; i--) {
        System.out.print(arr[i] + " ");
    }



}




    public static void main(String[] args) {

        // 1 задача:
        int year = 2021;
        definitionYear(year);

        // 2 задача
        int iOs = 0;
        int android = 1;
        int yearOfRelease = 2013;
        programSelectionIos(iOs, yearOfRelease);
        programSelectionAndroid(android, yearOfRelease);

        // 3 задача
        int deliveryDistance = 45;
        String b = deliver(deliveryDistance);
        System.out.println(b);

        // 4 задача
        String string = "aabccddefgghiijjkk";
        checkingDuplicates(string);

        // 5 задача

        int arr[] = {3, 2, 1, 6, 5};
        reverse(arr);


    }
}
