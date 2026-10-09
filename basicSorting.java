import java.util.Arrays;
import java.util.Collections;

public class basicSorting{


//      BUBBLE SORT ALGORITHM
    public static void BubbleSort(int arr[]){  
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }        
    }


//      SELECTION SORT ALGORITHM
    public static void selectionSort(int arr[]){  // 2,4,3,5,7,1
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }



//      INSERTION SORT ALGORITHM
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev --;
            }
            //  insertion
            arr[prev+1] = curr;
        }
    }



//  COUNTING SORT   T.C. :- O(n)
    public static void countSort(int arr[]){
        int largest = 0;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }



//          ASSIGNMENT QUESTION PRACTICE
//          COUNT SORT
    public static void countsort(int arr[]){
        int largest = 0;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }


//      BUBBLE SORT       
    public static void bubblesort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }



//      SELECTION SORT
    public static void selectionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }




//      PRINTING ARRAY
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    public static void main(String args[]){
        // int arr[] = {6,3,1,2,6,8,9};
        /*  BubbleSort(arr);        */      
        /*   selectionSort(arr);     */
        /*   insertionSort(arr);     */
        /* Arrays.sort(arr,0,3);       */
        /*  Arrays.sort(arr, Collections.reverseOrder());       */
        /*   countSort(arr);     */


//          ASSIGNMENT QUESTION PRACTICE
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        /*  countsort(arr);     */
        /*  bubblesort(arr);        */
        /*  selectionsort(arr);     */
        printArr(arr);

    }
}