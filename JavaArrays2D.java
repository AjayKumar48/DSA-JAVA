import java.util.*;

public class JavaArrays2D {

    public static boolean isPresent(int arr[][], int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == target){
                    System.out.print("The element present at: (" + i + ","+ j+")");
                    return true;
                }
            }
        }
        System.out.print("Not present");
        return false;
    }


    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol<= endCol){

            //  top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            //  right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //  left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }    

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }



//      DIAGONAL SUM
    public static void diagonalSum(int arr[][]){
        // int sum = 0;            // T.C. :- O(n^2)
        // int sum2 = 0;
        // int startRow = 0;
        // int endCol = arr[0].length;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(i == j){
        //             sum += arr[i][j];
        //         }
        //         else if (i+j == arr.length-1) {
        //             sum2 += arr[i][j];
        //             startRow++;
        //             endCol--;
        //         };
        //     }
        // }
        // System.out.println(sum);
        // System.out.println(sum2);
        // System.out.print(sum+sum2);



//  CODE WITH LINEAR TIME COMPLEXITY        T.C :-O(n)
    int n = arr.length;
    int sum = 0;
    for(int i=0; i<arr.length; i++){
        // primary diagonal where row no. == col no.
            sum += arr[i][i];

        //  secondary diagonal where  
        if(i != (n-i-1)){               // this condition is for odd row, col no. matrix 
            sum += arr[i][n-i-1];
        }
    }
     System.out.println(sum);

    }




//      SEARCH IN SORTED MATRIX (MOST OPTIMAL STAIR CASE SEARCH)    T.C. :- O(n+m)
    public static boolean searchSorted(int arr[][], int key){
        int row = 0, col = arr[0].length-1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == key){
                System.out.println("Key found at index : ( " + row + "," + col + " )");
                return true;
            }
            else if(arr[row][col] > key){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;

    }



    public static boolean searchSortedMarix(int arr[][], int key){
        int row = arr.length-1, col = 0;
        while(row >= 0 && col <= arr[0].length-1){
            if(arr[row][col] == key){
                System.out.println("Key found at index : ( " + row + "," + col + " )");
                return true;
            }
            else if(key > arr[row][col]){
                col++;
            }else{
                row--;
            }
        }
        System.out.println("Key not found");
        return false;
    }




//       ASSIGNMENT QUESTIONS
//  Question 1 Print the number of 7’s that are in the 2d array.
public static void countFrequency(int arr[][], int key){
    int count = 0;
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            if(arr[i][j] == key){
                count++;
            }
        }
    }
    System.out.println("Number of times " + key + " present is: " + count);
}


// Question 2 : Print out the sum of the numbers in the second row of the “nums" array. 
    public static void sumRow(int arr[][]){
        int sum = 0;
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
            System.out.println("The sum of 2nd row is : " + sum);
            break;
        }
    }



//  Question 3 : Write a program to Find Transpose of Matrix 
    public static void transpose(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length; 
        int endCol = arr[0].length;

        int transposeArr[][] = new int[endCol][endRow];
        for(int i=startRow; i<endRow; i++ ){
            for(int j=startCol; j<endCol; j++){
                transposeArr[j][i] = arr[i][j];
            }
        }
        printArr(transposeArr);
    }



//      PRINTING ARRAY
    public static void printArr(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println();
        }
    }



    public static void main(String args[]){

        // int arr[][] = new int[3][3];
        // int n = arr.length, m = arr[0].length;

        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(arr[i][j] + " "); 
        //     }
        //     System.out.println();
        // }

        /*  isPresent(arr, 15);    */   
        // int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        // int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        // int arr[][] = {{10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
        /*  searchSorted(arr, 50);      */
        /*  searchSortedMarix(arr, 40);     */


        /*  diagonalSum(matrix);        */
        /*  spiralMatrix(matrix);       */




//       ASSIGNMENT QUESTIONS
//  Question 1 Print the number of 7’s that are in the 2d array.
    // int arr[][] = {{1,7,9}, {8,8,7}};
    /*  countFrequency(arr, 3);     */


// Question 2 : Print out the sum of the numbers in the second row of the “nums" array. 
    // int arr[][] =  { {1,4,9},{11,4,3},{2,2,3} }; 
    /*  sumRow(arr);        */



//      Question 3 : Write a program to Find Transpose of Matrix 
    // int arr[][] =  { {1,4,9,3,6},{11,4,3,2,1}, {1,7,9,5,6}};
    /*  transpose(arr);     */


    }

}