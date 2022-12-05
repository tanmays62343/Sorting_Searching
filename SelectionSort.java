import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int [] A1 = {8,2,3,4,1,5,6};
        SelectionSort S = new SelectionSort();
        S.selectionSort(A1);
        System.out.println(Arrays.toString(A1));
    }

    public void selectionSort(int [] arr){
        for(int j=0 ;j<arr.length;j++){
            int minimumIndex = j;
            for (int i =j+1 ;i<arr.length;i++){
                if(arr[i]<arr[minimumIndex]){
                    minimumIndex = i;
                }
            }
            if(minimumIndex != j){
                int temp = arr[j];
                arr[j]=arr[minimumIndex];
                arr[minimumIndex]=temp;
            }
        }
    }

}
