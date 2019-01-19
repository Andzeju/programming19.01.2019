package pl.sda.recap;

import java.util.List;

public class Task1Demo {
    public static void main(String[] args) {
        int[] tab = new int[11];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = 3 * i;
        }

        printEverySecondValueOfTable(tab);
        System.out.println();
        printOddOrEvenValues(tab, false);

    }

    private static void printEverySecondValueOfTable(int[] tab) {
        for (int i = 0; i < tab.length; i += 2) {
            System.out.println(tab[i]);
        }
    }

    private static void printEverySecondValueOfTable(List<Integer> tab) {
        for (int i = 0; i < tab.size(); i += 2) {
            System.out.println(tab.get(i));
        }
    }

    private static void printOddOrEvenValues(int[] tab, boolean printodd) {
        for (int tmp : tab) {

            if (printodd && tmp % 2 == 1){
                System.out.println(tmp);
            }

            if (!printodd && tmp % 2 == 0){
                System.out.println(tmp);
            }
        }

    }
}
