package main.java;

import java.util.*;

public class Main {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[] {age1, age2, age3, age4};
    }

    public String firstAndLastTogether(String[] names){
        String namesPlus = names [0] + " AND " + names[9] + " " + "TOGETHER";
        return namesPlus;
    }
    public String[] changeElectResultAgain(String[] result){
        String[] resultAgain = new String[3];
        resultAgain[0] = result[2];
        resultAgain[1] = result[3];
        resultAgain[2] = result[4];

        return resultAgain;
    }

    public char[][] createKeyboard() {
        return new char[][]  {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
    }

    public void printKeyboard(){
        Main out = new Main();
        char [][] outputKeyboard = createKeyboard();
        System.out.println(Arrays.toString(outputKeyboard[0]));
        System.out.println(Arrays.toString(outputKeyboard[1]));
        System.out.println(Arrays.toString(outputKeyboard[2]));
        System.out.println(Arrays.toString(outputKeyboard[3]));

    }
    public String[] makeCopy(String[] names){
        System.out.println("Copied!");
        return Arrays.copyOf( names, names.length);
    }

    public static void main(String[] args) {
        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new Main().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));
    }
}

