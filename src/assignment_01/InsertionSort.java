package assignment_01;

public class InsertionSort {

    public void sort(int[] array) {
        int curr, prev;
        for (int i = 1; i < array.length; i++) {
            curr = array[i];
            prev = i - 1;

            while (prev >= 0 && array[prev] > curr) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = curr;
        }
    }
}