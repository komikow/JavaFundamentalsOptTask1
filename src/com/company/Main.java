package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

//Ввести n чисел с консоли.
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        String str = reader.readLine();
        int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i=0; i< numArr.length; i++){
            arrayList.add(String.valueOf(Math.abs(Integer.parseInt(Integer.toString(numArr[i])))));
        }
        SortingNumbers.sort(arrayList);//используем пузырьковую сортировку
        System.out.println("Самое короткое число: "+arrayList.get(0)+"; его длина равна "+arrayList.get(0).length());
        System.out.println("Самое длинное число: "+arrayList.get(arrayList.size()-1)+"; его длина равна "+arrayList.get(arrayList.size()-1).length());
    }
}
