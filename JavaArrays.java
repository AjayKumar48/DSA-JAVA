import java.util.*;

public class JavaArrays{

    public static void updateArrays(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 2;
        }
    }

//  LINEAR SEARCH
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }


//  LARGEST NUMBER OF ARRAY
    public static int largestNum(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        return largest;
    }



//   BINARY SEARCH
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }



// REVERSE AN ARRAY
    public static void reverseArr(int arr[]){
        int start = 0, end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
    }



//  PRINT PAIRS OF ARRAY
    public static void pairArr(int arr[]){
        int totalPair = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs are: " + totalPair);
    }



// Maximum and Minimum SUBARRAYS Sum OF ARRAY     :----  BRUTE FORCE TECHNIQUE   T.T :-O(n^3)  
    public static void subArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int count =0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){        // start
            for(int j=i+1; j<=arr.length; j++){  // end
                sum = 0;
                for(int k=i; k<j; k++){
                    sum = sum + arr[k];
                    System.out.print( arr[k] + " ");
                }
            if(maxSum < sum){
                maxSum = sum;
            }
            if(minSum > sum){
                minSum = sum;
            }
                System.out.print("      The sum of the subarray is:  " + sum);
                count ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The minimum subarray sum is: " + minSum);
        System.out.println("The maximum subarray sum is: " + maxSum);
        System.out.println("The total number of subarrays are: "+count);
    }



// Maximum SUBARRAYS Sum OF ARRAY     :---- Prefix sum TECHNIQUE   T.T :-O(n^2)   
    public static void maxSum(int arr[]){
        int resMax = Integer.MIN_VALUE;
        int prefixArr[] = new int[arr.length];
        int sum = 0;

        prefixArr[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;

                sum = start == 0 ? prefixArr[end] : prefixArr[end] - prefixArr[start-1];

                if(resMax < sum){
                    resMax = sum;
                }
            }
        }
        System.out.println("the maximum sum is : " + resMax);
    }




// Maximum SUBARRAYS Sum OF ARRAY     :----Kadens Algorithm   T.C :-O(n) MOST OPTIMIZED APPROACH
    // public static void kadens(int arr[]){
    //     int cs = 0;
    //     int ms = Integer.MIN_VALUE;

    //     int checkNeg = Integer.MIN_VALUE;
    //     int resMinNeg = 0;

    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] < 0 ){
    //             if(arr[i] > checkNeg ){
    //                 checkNeg = arr[i];
    //                 resMinNeg = checkNeg;
    //             }
    //         }
    //     }
    //     if(resMinNeg < 0){
    //         System.out.println("The maximum subarray sum is : " + resMinNeg);
    //     }else{
    //         for(int i=0; i<arr.length; i++){
    //             cs = cs + arr[i];
    //             if(cs < 0){
    //                 cs = 0;
    //             }

    //             ms = Math.max(ms,cs);
    //         }
    //         System.out.println("The maximum sum is : " + ms);
    //         }
    //     }

    public static void kadens(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;         
        for(int i=0; i<arr.length; i++){
        cs = cs + arr[i];
        if(cs < 0){
            cs = 0;
        }

        ms = Math.max(ms,cs);
    }
    System.out.println("The maximum sum is : " + ms);
}




//  TRAPPING    RAINWATER - T.C.:- O(n)
    public static int trapRainWater(int height[]) {
        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }




//  BUY AND SELL STOCKS  - T.C. :- O(n)
    public static int buyAndSellStocks(int prices[]){
        int buyStock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyStock < prices[i]){
                int Profit = prices[i] - buyStock;
                maxProfit = Math.max(maxProfit, Profit);
            }else{
                buyStock = prices[i];
            }
        }
        return maxProfit;
    }





//          ASSIGNMENT QUESTIONS OF ARRAYS
//   Ques 1) Given an integer array nums, return true if any value appears at east twice in the array, and return false if every element is distinct.
    public static boolean isRepeated(int arr[]){
        for(int i=0; i<arr.length; i++){
            int pointer = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }



//   Ques 2)  You are given an array prices where prices[i] is the price of a given stock on the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit return 0.
    public static int buyAndSell(int prices[]){
        int maxProfit = 0;
        int buystock = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(buystock < prices[i]){
                int Profit = prices[i] - buystock;
                maxProfit = Math.max(maxProfit, Profit);
            }else{
                buystock = prices[i];
            }
        }
        return maxProfit;
    }



// Question 3: Given n non-negative integers representing an elevation map where the width of each bar is 1 , compute how much water it can trap after raining.
    public static int trappedRainWater(int height[]){
        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }


// Question 5: There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1] ,..., nums[n-1], nums[0], nums[1],..., nums[k-1]] (0-indexed). For example,[0,1,2,4,5,6,7] might rotated at pivot index 3 and be become ,[4,5,6,7,0,1,2], Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums. You must write an algorithm with O(log n) runtime complexity.
    





// Question 4: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i!=j, i!=k, and j!=k, and nums[i] + nums[j] + nums[k] == 0.  Notice that the solution set must not contain duplicate triplets. -1, 0, 1, 2, -1, -4
    public static void triplets(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] != arr[j]){
                    for(int k=j+1; k<n; k++){
                        if(((arr[i]!= arr[k]) && (arr[j] != arr[k]))  && (arr[i] + arr[j] + arr[k] == 0)){
                            System.out.println("[" + arr[i] + ", " + arr[j] + ", " + arr[k] + "]" );
                        }
                    }
                }
            }
        }
    }







    public static void main(String args[]){

        /*  int marks[] = new int [5];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Phy:" + marks[0]);
        System.out.println("Chem:" + marks[1]);
        System.out.println("Math:" + marks[2]);

        marks[1] = marks[1] + 6;
        System.out.println("Chem:" + marks[1]); */


//  Updating Marks
        /*  int marks[] = {45, 76, 95};
        updateArrays(marks);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + "  ");
        }       */


//  Linear Search 
       /*   int numbers[] = {45, 76, 95, 10, 23, 12, 11, 80};
       int index = linearSearch(numbers, 100);
       if(index != -1) {
            System.out.print("Key found at index : " + index);
       }else{
            System.out.print("Key NOT found ");
       }        */


//  LARGEST NUMBER OF ARRAY
    // int num[] = {1245, 760, 9500, 10, 23, 12, 11, 180};
    /*  int num[] = {0,-1,-3,-6};
    int resultLargest = largestNum(num);
    System.out.println("Largest number of all is : " + resultLargest);      */



//   BINARY SEARCH
    /*  int arr[] = {1,2,3,4,5,6,7,8};
    int result = binarySearch(arr, -6);
    System.out.println("Index: " + result);     */


// REVERSE AN ARRAY
    /*  int arr[] = {1,2,3,4,5,6,7};
    reverseArr(arr);
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + "    ");
    }       */

//  Pair of Array
    /*  int arr[] = {2,4,6,8,10};
    pairArr(arr);       */


//  Maximum and Minimum SUBARRAYS Sum OF ARRAY     :----  BRUTE FORCE TECHNIQUE   T.C :-O(n^3)  worst case
    /*  int arr[] = {1,2,3,4,5,-9};
    subArray(arr);      */



// Maximum SUBARRAYS Sum OF ARRAY     :---- Prefix sum TECHNIQUE   T.C :-O(n^2)
    /*  int arr[] = {1,2,3,4,5,-9};
    maxSum(arr);        */


// Maximum SUBARRAYS Sum OF ARRAY     :----Kadens Algorithm   T.C :-O(n) MOST OPTIMIZED APPROACH
    //   int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    // int arr[] = {1,2,3,4,5};
    // int arr[] = {-1,-2,-3,-4,-5};
    // kadens(arr);        



//  TRAPPING    RAINWATER - T.C.:- O(n)
    /*  int height[] = {4,2,0,6,3,2,5,32};
    System.out.print("The maximum trapped water is : ");
    System.out.println(trapRainWater(height));     */


//  BUY AND SELL STOCKS  - T.C. :- O(n)
    /*  // int prices[] = {7,1,5,3,6,4};
    int prices[] = {7,6,5,4,3,2,1};
    System.out.print("The maximum profit you can have is : ");
    System.out.print(buyAndSellStocks(prices));     */



//              ASSIGNMENT QUESTION BASED ON ARRAYS
//   Ques 1) Given an integer array nums, return true if any value appears at east twice in the array, and return false if every element is distinct.
    /*  int arr[] = {1,1,2,3,4,1};
    System.out.print(isRepeated(arr));      */



//   Ques 2)  You are given an array prices where prices[i] is the price of a given stock on the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit return 0.
    /*  int prices[] = {7, 6, 4, 3, 1};
    System.out.print(buyAndSell(prices));       */



// Question 3: Given n non-negative integers representing an elevation map where the width of each bar is 1 , compute how much water it can trap after raining.
    /*  // int height[] = { 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    int height[] ={ 4, 2, 0, 3, 2, 5 };
    System.out.print("The trapped water amount is : ");
    System.out.print(trappedRainWater(height)); */



// Question 4: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i!=j, i!=k, and j!=k, and nums[i] + nums[j] + nums[k] == 0.  Notice that the solution set must not contain duplicate triplets.
    int arr[] = {-1, 0, 1, 2, -1, -4};
    triplets(arr);




    }
}
