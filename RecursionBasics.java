class RecursionBasics{

//      PRINTING NUMBER FROM 10 TO 1
    public static void printNum(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        printNum(n-1);

    }

//      PRINTING NUMBER FROM 1 TO 10
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n +" ");
            return;
        }
        printInc(n-1);
        System.out.print(n +" ");
    }


//      PRINTING NUMBER Factorial of number
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        int fNm1 = factorial(n-1);
        int fact = n * fNm1;
        return fact;
    }


//      PRINT SUM OF FIRST N NATURAL NUMBERS
    public static int nSum(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + nSum(n-1);
        return sum;
    }


//      PRINT FIBONACCI SERIES OF NUMBER N
    public static int fibonaci(int n){
        if(n == 1 || n == 0){
            return n;
        }
        int fibonm1 = fibonaci(n-1);
        int fibonm2 = fibonaci(n-2);
        int fibon = fibonm1 + fibonm2;
        return fibon;
    }



//      CHECK IF THE ARRAY IS SORTED OR NOT
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1 ){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }


//      WRITE A FUNCTION TO FIND THE FIRST OCCURNCE OF AN ELEMENT IN ARRAY
    public static int firstOccurance(int arr[], int ele, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == ele){
            return i;
        }
        return firstOccurance(arr, ele, i+1);
    }


//      WRITE A FUNCTION TO FIND THE LAST OCCURNCE OF AN ELEMENT IN ARRAY
    public static int lastOccurance(int arr[], int ele, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, ele, i+1);
        if(isFound == -1 && arr[i] == ele){
            return i;
        }
        return isFound;
    }


//      CALCULATE X^N       T.C = O(n)  S.C = O(n)
    public static int calPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int next = calPower(x, n-1);
        int res = x * next;
        return res;
    }


//      CALCULATE X^N   OPTIMIZED   T.C. = O(log n )
    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowersq = halfPower * halfPower;
        if(n%2 != 0){
            halfPowersq = x*halfPowersq;
        }
        return halfPowersq;
    }


//  TILING PROBLEM => GIVEN A 2xN BOARD AND TILES OF SIZE 2x1. COUNT THE NO. OF WAYS TO TILE THE GIVEN BOARD USING THE 2x1 TILES. (A TILE CAN EITHER BE PLACED VERTICALLY OR HORIZONTALLY)
    public static int tileWays(int n){
        //  if the width of board is 0 or 1 then either 0 tile or only 1 tile can take place so ways are only 1(vertically)
        if(n == 1 || n==0){
            return 1;
        }
    //  choice vetically
        int fnm1 = tileWays(n-1);

    //  choice horizontally
        int fnm2 = tileWays(n-2);

    //  total ways
        int totalWays = fnm1 + fnm2;

        return totalWays;
    }



//      REMOVE DUPLICATES IN A STRING
    public static void removeDuplicate(String str, int idx, boolean map[], StringBuilder newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']  == true){
            removeDuplicate(str, idx+1, map, newString);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, map, newString.append(currChar));
        }
    }


//  FRIENDS PAIRING PROBLEM:- GIVEN N FRIENDS EACH ONE CAN RMAIN SINGLE OR CAN BE PAIRED UP WITH SOME FRIEND. EACH FRIEND CAN BE PAIRED ONLY ONCE. FIND OUT THE TOTAL NUMBER OF WAYS IN WHICH FRIENDS CAN REMAIN SINGLE OR CAN BE PAIRED UP.
    public static int friendPairing(int n){
        if(n == 1 || n==2){
            return n;
        }
        int single = friendPairing(n-1);
        int pairUp = friendPairing(n-2);
        int pairWays = (n-1) * pairUp;
        int res = single + pairWays;
        return res;
    }


//      BINAR STRING PROBLEM:-  PRINT ALL BINARY STRINGS OF SIZE N WITHOUT CONSECUTIVE ONES.
    public static void binaryString(int n, String str, int lastDig){
        //  base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //  kaam
        binaryString(n-1,str+"0",0);
        if(lastDig == 0){
            binaryString(n-1,str+"1",1);
        }

    }





//          ASSIGNMENT QUESTIONS
// Question 1) For a given integer array of Size You have to find all the cmurrences (Indices) of a given element (Key) and print Use a recursive furction to solve this problem.
    public static void indices(int i, int ele, int arr[]){
        if(i >= arr.length){
            return;
        }
        if(arr[i] == ele){
            System.out.println(i);
        }
        indices(i+1, ele, arr);
    }



// Question 2 :You are given a number (eg 2019),convert it into a String of english like  •two zero one nine use a recursive function for solving this. NOTE - The digits Of number will only be in the range O, last digit Of a number cant be O.
    public static void convertNumIntoEnglish(int num){
        String digit[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if(num == 0){
            return;
        }
        int lastDigt = num%10;
        convertNumIntoEnglish(num/10);
        System.out.print(digit[lastDigt] + " ");
    }



// Question 3 : Write a program to find length of string using Recursion.
    public static int lengthFun(String str){
        if(str.length() == 0){
            return 0;
        }
        return lengthFun(str.substring(1)) + 1;

    }



// Question 4 : We are given a string s and we need to find the count of all countiguous substrings starting and ending with the same character.    ( I HAVE SOLVED IT USING LOOPS )
    // public static int subStr(String str){
    //     int res = str.length();
    //     for(int i=0; i<str.length(); i++){
    //         for(int j=i+1; j<str.length(); j++){
    //             if(str.charAt(i) == str.charAt(j)){
    //                 res ++;
    //             }
    //         }
    //     }
    //     return res;
    // }



// Question 5 : TOWER OF HANOI (Important!)
    public static void towerOfHanoi(int n, String source, String helper, String destination){
        if(n == 1){
            System.out.println("transfer disk " + n + " from " + source + " to " + destination);
            return;
        }

//  transfer n-1 disks in helper using destination as helper
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("transfer disk " + n + " from " + source + " to " + helper);

//  transfer n-1 disks in destionation from helper
        towerOfHanoi(n-1, helper, source, destination);

    }




    public static void main(String args[]){

//      PRINTING NUMBER FROM 10 TO 1
    // int n =10;
    // printNum(n);


//      PRINTING NUMBER FROM 1 TO 10
    // int n =10;
    // printInc(n);


//      PRINTING NUMBER Factorial of number
    // int n=6;
    // System.out.print(factorial(n));


//      PRINT SUM OF FIRST N NATURAL NUMBERS
    // int res = nSum(10);
    // System.out.print(res);


//      PRINT FIBONACCI SERIES OF NUMBER N
    // int res = fibonaci(10);
    // System.out.print(res);


//      CHECK IF THE ARRAY IS SORTED OR NOT
    // int arr[] = {-3,1,2,3,4,5};
    // System.out.println(isSorted(arr,0));


//      WRITE A FUNCTION TO FIND THE FIRST OCCURNCE OF AN ELEMENT IN ARRAY
    // int arr[] = {1,3,2,3,3,4,5};
    // System.out.println(firstOccurance(arr, 5, 0));


//      WRITE A FUNCTION TO FIND THE LAST OCCURNCE OF AN ELEMENT IN ARRAY
    // int arr[] = {1,3,2,3,3,4,5,3};
    // System.out.println(lastOccurance(arr, 1, 0));


//      CALCULATE X^N        T.C = O(n)  S.C = O(n)
    // System.out.println(calPower(2,10));


//      CALCULATE X^N   OPTIMIZED   T.C. = O(log n )
    // System.out.println(calPower(2,10));


//  TILING PROBLEM
    // System.out.println(tileWays(4));


//      REMOVE DUPLICATES IN A STRING
    // String str = "ajayparashar";
    // removeDuplicate(str, 0, new boolean[26], new StringBuilder(""));



//  FRIENDS PAIRING PROBLEM
    // System.out.println(friendPairing(3));


//      BINAR STRING PROBLEM:-  PRINT ALL BINARY STRINGS OF SIZE N WITHOUT CONSECUTIVE ONES.
    // binaryString(3,"",0);



//          ASSIGNMENT QUESTIONS
// Question 1)
    // int arr[] = {1,2,4,5,2,1,2,4};
    // indices(0, 2, arr);


// Question 2)
    // convertNumIntoEnglish(2019);


// Question 3
    // String str = "abc";
    // System.out.println(lengthFun(str));


// Question 4
    // String str = "ajay";
    // System.out.println(subStr(str));


// Question 5
    // int n = 3;
    // towerOfHanoi(n, "A", "B", "C");

    }
}