import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {

    public static void main(String[] args) {

        int [] A1 = {8,2,3,4,1,5,6};
        BucketSort B = new BucketSort();
        B.bucketSort(A1);
        System.out.println("The Sorted array is :"+ Arrays.toString(A1));
    }
    public void printBuckets(ArrayList<Integer>[] buckets){
        for(int i =0; i<buckets.length; i++){
            System.out.println("\nBucket#"+i+":");
            for(int j=0; j<buckets[i].size(); j++){
                System.out.print(buckets[i].get(j)+" ");
            }
        }
        System.out.println("\n");
    }
    public void bucketSort(int [] arr){
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for (int value:arr) {
            if(value>maxValue){
                maxValue = value;
            }
        }
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for(int i=0 ;i<buckets.length ; i++){
            buckets[i] = new ArrayList<Integer>();
        }
        for (int value:arr){
            int bucketNumber = (int)Math.ceil(((float)value * numberOfBuckets /(float)maxValue));
            buckets[bucketNumber-1].add(value);
        }
        System.out.println("Printing Buckets after sorting...");
        printBuckets(buckets);

        for(ArrayList<Integer>bucket : buckets){
            Collections.sort(bucket);
        }
        int index = 0;
        for(ArrayList<Integer>bucket :buckets){
            for(int value: bucket){
                arr[index] = value;
                index++;
            }
        }
    }
}
