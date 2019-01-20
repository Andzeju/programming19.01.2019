package pl.sda.sorting;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=nmhjrI-aW5o
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arrayToSort[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        bubbleSort(arrayToSort);

        for (int index : arrayToSort) {
            System.out.println(index);
        }
    }

     private static int[] bubbleSort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = 1; j < arrayToSort.length - 1 - i; j++) {
                int tmp = 0;
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    tmp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = tmp;
                }
            }

        }
        return arrayToSort;

    }
}