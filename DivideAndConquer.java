public class DivideAndConquer{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


//      MERGE SORT 
    public static void mergeSort(int arr[], int si, int ei){
        int mid = si + (ei - si)/2;
        if( si >= ei){
            return;
        }
        //  for left half sub array
        mergeSort(arr, si, mid);
        //  for right sub array
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;         // idx for 1st sorted array
        int j = mid+1;      // idx for 2nd sorted array
        int k = 0;          // idx for temperary array

        while( i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

//      for left array elements which are leftover(bache hue)
        while( i <= mid){
            temp[k++] = arr[i++];
        }

//       for right array elements which are leftover(bache hue)
        while( j <= ei){
            temp[k++] = arr[j++];
        }

//    for loop for changing the original array
        for(k = 0, i=si; k<temp.length; k++, i++ ){
            arr[i] = temp[k];
        }

    }


    public static void main(String args[]){

//      MERGE SORT 
        // int array[] = {6,3,9,5,2,8};
        // mergeSort(array, 0, array.length-1);
        // printArr(array);
    }
}