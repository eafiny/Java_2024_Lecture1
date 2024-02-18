package ru.muctr.Lab1;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Evgenia Skichko
 */
public class Lab1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1000];
        for(int i:array){
            array[i] = random.nextInt(1000);
        }
        long start = System.currentTimeMillis();
        Arrays.sort(array);
        System.out.println(System.currentTimeMillis() - start);
    }
}
