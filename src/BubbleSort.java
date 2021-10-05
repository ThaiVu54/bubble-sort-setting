public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 21, 23, 11, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] arr) {
        boolean nextPass = true;
        for (int i = 1; i < arr.length && nextPass; i++) {
            nextPass = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (list[j] < list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    nextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
