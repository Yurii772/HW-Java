package com.yurii_kravchenko;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class HW {

    String[] arrayOne = {"12", "15", "25", "65", "20", "8"};
    int[][] arrayTwo = {
            {22, 17},
            {10, 8}
    };
    int[] array = {};

    public void arrayProcessing(String[] args) {
        int [] intarrayOne=new int [arrayOne.length];
             for (int i = 0; i < arrayOne.length; ++i) {
             intarrayOne[i]=Integer.parseInt(arrayOne[i]);;
             }

    }
    public static void arrayListCreation(String[] args) {
        ArrayList<String> List_of_drugs = new ArrayList<String>();
        System.out.println("Сколько лекарств планируешь ввести?");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count=0;
        while (count<num) {
            System.out.println("Введи название лекарства");
            Scanner sc = new Scanner(System.in);
            List_of_drugs.add(sc.next());
            ++count;

        }
    }
}
//int[] intarrayOne = Arrays.asList(arrayOne).stream().mapToInt(Integer::parseInt).toArray(); дает результат [I@b1bc7ed
//цикл неправильно парсит интеджер