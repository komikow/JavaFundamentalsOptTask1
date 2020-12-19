package com.company;

import java.util.ArrayList;

public class SortingNumbers {
    public static void sort(ArrayList<String> array){
        for(int i=0; i< array.size()-1; i++){
            for (int j= array.size()-1; j>i; j--){
                if(array.get(j - 1).length()> array.get(j).length()){
                    String tmp = array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, tmp);
                }
            }
        }
    }
}
