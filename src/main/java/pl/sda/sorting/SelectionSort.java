package pl.sda.sorting;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=xWBP4lzkoyM
 */
public class SelectionSort {
    public static void main(String[] args) {
        int arrayToSort[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        selectionSort(arrayToSort);

        for (int index : arrayToSort) {
            System.out.println(index);
        }
    }

    private static int[] selectionSort(int[] arrayToSort) {

        for (int i = 0; i < arrayToSort.length; i++) {
            int currentMimimumIndex = i;
            int currentMinimum = arrayToSort[i];

            for (int j = i+1; j < arrayToSort.length; j++) {
                if (arrayToSort[j] < currentMinimum) {
                    currentMimimumIndex=j;
                    currentMinimum=arrayToSort[j];
                }
            }
            arrayToSort[currentMimimumIndex]=arrayToSort[i];
            arrayToSort[i]=currentMinimum;

        }
        return arrayToSort;
    }
}
