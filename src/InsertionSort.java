public class InsertionSort {

    int curr, prev, i;

    public void sort(int[] array) {
        for (i = 1; i < array.length; i++) {
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