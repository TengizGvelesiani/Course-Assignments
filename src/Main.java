public class Main{

    public static void main(String[] args) {
        int[] test = {6, 1, 3, 5, 10, 4, 7, 8, 9, 2, 15, 11};

        InsertionSort insertion = new InsertionSort();
        insertion.sort(test);

        System.out.println("Result: ");
        for (int i : test) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}