import java.util.*;

public class JavaStrings{


//  Question 1) find string is palindrom or not
    public static boolean isPalindrome(String str){
        int n = str.length();
        int start = 0;
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }



//  Question 2) find the shortest path to cover the distance
    public static float shortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            if(dir == 'E'){
                x++;
            }else if(dir == 'W') {
                x--;
            }else if(dir == 'N') {
                y++;
            }else{
                y--;
            }
        }
        float result = (float) Math.sqrt((x*x) + (y*y));
        return result;
    }



//  Question 3) find largest string of all (lexically (in order of alphabets))
    public static void findLargest(String str[]){
        String largest = str[0];
        for(int i=1; i<str.length; i++){
            if(largest.compareTo(str[i]) < 0 ){
                largest = str[i];
            }
        }
        System.out.print(largest);
    }




//  Question 4) Convert the first letter of each word to uppercase  
    public static void toUpper(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<(str.length()-1)){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.print(sb);
    }



//  Question 5) compress the given string
    public static void compressStr(String str){ //aabbc
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            int count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }
        System.out.println(sb);
    }



//          ASSIGNMENT QUESTIONS
// Question 1) Count how many times lowercase vowels occurred in a String entered by the user
    public static void countVowels(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("No. of vowels present are: " + count);
    }




// Question 2 : Determine if 2 strings are anagrams of each Other.
    public static void isAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char str1Arr[] = str1.toCharArray();
            char str2Arr[] = str2.toCharArray();

            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);

            boolean result = Arrays.equals(str1Arr, str2Arr);
            if(result){
                System.out.println("The entered strings are Anagram");
            }else{
                System.out.println("The entered strings are not Anagram");
            }
        }else{
            System.out.println("The entered strings are not Anagram");
        }

    }




    public static void main(String args[]){


//                      STRING BUILDER CONCEPT
        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a'; ch<='z'; ch++){
        //     sb.append(ch);
        // }
        // System.out.print(sb);
        // System.out.print(sb.length());




//  Question 1) find string is palindrom or not
        /*  String str = "racepcar";        */
        /*  System.out.println(isPalindrome(str));      */


//  Question 2) find the shortest path to cover the distance
       /* String str = "WNEENESENNN";
        System.out.print(shortestPath(str));        */



//  Question 3) find largest string of all (lexically (in order of alphabets))
        /*  String str[] = {"apple","mango", "banana", "orange"};
        findLargest(str);           */



//  Question 4) Convert the first letter of each word to uppercase  
    /*  String str ="hello WORLD";
    toUpper(str);       */



//  Question 5) compress the given string
    /*  String str ="affggh";
    compressStr(str);       */






//          ASSIGNMENT QUESTIONS
// Question 1) Count how many times lowercase vowels occurred in a String entered by the user
    /*  String str = new Scanner(System.in).next();
    countVowels(str);       */


// Question 2 : Determine if 2 strings are anagrams of each Other.
    /*  System.out.print("Enter first string: ");
    String str1 = new Scanner(System.in).next();
    System.out.print("Enter second string: ");
    String str2 = new Scanner(System.in).next();
    isAnagram(str1, str2);      */

    }
}