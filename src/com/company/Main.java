package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] peoples = {"Darya", "Den", "Maks"};

        String[] nextpeople =copyArray(peoples);
        nextpeople[3] = "Jora";
        for (String people : nextpeople) {
            switch (people) {
                case "Darya":
                    System.out.println("Доброе утро " + people);
                    break;
                case "Den":
                    System.out.println("Доброго дня " + people);
                    break;
                case "Maks":
                    System.out.println("Добрый вечер " + people);
                    break;
                case "Jora":
                    System.out.println(people + " Доброй ночи вновь прибывший");
                    break;

            }
        }
    }

    public static String[] copyArray(String[] array) {
            String[] newarray = Arrays.copyOf(array, array.length+1);
       return newarray;
    }

}
