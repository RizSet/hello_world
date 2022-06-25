package main.java;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int [][] array = new int [4][2];

        array [0][0] = 0;
        array [0][1] = 1;
        array [1][0] = 2;
        array [1][1] = 3;
        array [2][0] = 4;
        array [2][1] = 5;
        array [3][0] = 6;
        array [3][1] = 7;

        System.out.println(Arrays.toString(array));


    }
}
