import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int [] A1 = {8,2,3,4,1,5,6};
        InsertionSort I = new InsertionSort();
        I.insertionSort(A1);
        System.out.println(Arrays.toString(A1));
    }

    public void insertionSort(int [] arr){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j]= arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
}
