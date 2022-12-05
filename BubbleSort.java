import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int [] A1 = {8,2,3,4,1,5,6};
        BubbleSort b = new BubbleSort();
        b.bubbleSort(A1);
        System.out.println(Arrays.toString(A1));
    }

    public void bubbleSort(int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
