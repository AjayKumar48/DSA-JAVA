import java.util.*;

public class JavaFuctions{

    public static int sumTwo(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped value of a: " + a);
        System.out.println("Swapped value of b: " + b);
    }

    public static int product(int a, int b){
        int prod = a*b;
        return prod;
    }

    public static int factorial(int a){
        int fact = 1;
        for(int i=1; i<=a; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static int binomialCofficient(int n, int r){
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);
        int resCoff = (factN/(factR*(factNR)));
        return resCoff;
    }


    public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }else{
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }


    public static void findPrimeInRange(int num){
        for(int i=2; i<=num; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public static void binToDec(int binary){
        int BinNumber = binary;
        int dec = 0;
        int power = 0;
        while(binary > 0){
            int lastDig = binary % 10;
            dec = (dec + ((int) Math.pow(2, power) * lastDig));
            power ++;
            binary = binary/10;
        };
        System.out.println("Decimal number of " + BinNumber + " is " + dec);
    }


    public static void decToBin(int decimal){
        int myNum = decimal;
        int power = 0;
        int binary = 0;
        while(decimal > 0){
            int rem = decimal % 2;
            binary = (binary + ((int) Math.pow(10, power) * rem));
            power ++;
            decimal = decimal / 2;
        };
        System.out.println("Binary number of " + myNum + " is " + binary);
    }


        /*  FUNCTION ASSIGNMENT PRACTICE */
/*      Question 1 : Write a Java method to compute the average of three numbers.      */
        public static void avgThree(int a, int b, int c){
            int sum = (a+b+c)/3;
            System.out.print(sum);
        }


/*      Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.  */
        public static boolean isEven(int a){
            boolean even = true;
            if(a % 2 != 0){
                even = false;
                return even;
            }
            return even;
        }



/*      Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not) */
        public static void isPalindrome(int num){
            int start = num;
            int reverse = 0;
            while(num != 0){
                int lastDigit = num % 10;
                reverse =  (reverse*10) + lastDigit;
                num = num / 10;
            }
            if(reverse == start){
                System.out.println("The number "+ start +  " is a Palindrome");
            }else{
                System.out.println("The number "+ start +  " is not a Palindrome");
            }

        }



/*      Question 4 : Write a Java method to compute the sum of the digits in an integer. */
        public static void sumDigits(int num){
            int start = num;
            int sum = 0;
            while(num > 0){
                int lastDigit = num % 10;
                sum += lastDigit;
                num /= 10;
            }
            System.out.println("The sum of " + start + " is " +sum);
        }




                                /*  ADVANCED PATTERNS */

//   HOLLOW RECTANGLE PATTERN
    public static void hollowRectangle(int len, int wdth){   
        for(int i=1; i<=len; i++){
            for(int j=1; j<=wdth; j++){
                if(i == 1 || i == len || j==1 || j== wdth){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }



//  INVERTED HALF-PYRAMID wŤth Numbers pattern
    public static void invertedHalfPyramid(){   
        for(int i=5; i>=1; i--){
                for(int j=1; j<=i; j++){
                        System.out.print(j + " ");
                }
                System.out.println();
        }
        
    }


//  INVERTED HALF-PYRAMID wŤth star pattern
    public static void invertHalfStarPyramid(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }




//  FLOYD'S TrŤangle pattern
    public static void floydsTriangle(int num){
        int count = 1;
        for(int i=1; i<=num; i++){
                for(int j=1; j<=i; j++){
                        System.out.print(count + " ");
                        count++;
                }
                System.out.println();
        }
    }


//  Inverted half Pyramid with Numbers   ( we can use another technique i.e. use condition as j<=num-i+1 in nested loop)
    public static void invertWithNum(int num){
        for(int i=num; i>= 1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }



//  0-1 TrŤangle pattern
    public static void zeroOne(int num){
        for(int i=1; i<=num ; i++){
                for(int j=1; j<=i; j++){
                        if((i+j) % 2 == 0){
                                System.out.print(1 + " ");
                        }else{
                            System.out.print(0 + " ");
                        }
                }
                System.out.println();
        }
    }



//  Butterfly Pattern
    public static void butterfly(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*(num-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=num; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*(num-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



// Solid Rhombus Pattern
    public static void solidRhombus(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



//  Hollow Rhombus
    public static void hollowRhombus(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=num; j++){
                if((i == 1 || i== num) || (j==1 || j==num)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }



//  Diamond Pattern
    public static void diamond(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=num; i>=1; i--){
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }




//  Number Pyramid
    public static void numberPyr(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }



//  Palindromic Pattern with Numbers
    public static void palindromNum(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }




    public static void main(String args[]){
        /*      FUNCTIONS / METHODS     */
        //  Adding two numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter b: ");
        // int b = sc.nextInt();
        // System.out.print("Enter c: ");
        // int c = sc.nextInt();



        /*  int sum = sumTwo(a, b);
        System.out.println(sum);    */
        /*swap(a, b);*/


        /*  int productResult = product(a, b);
        System.out.println(productResult); */


        /*  int resultFact = factorial(a);
        System.out.print("Factorial of given number is : " + resultFact);   */

        /*  int resCofficient = binomialCofficient(a, b);
        System.out.print("Cofficient of given numbers is : " + resCofficient);  */

        /*  boolean result = isPrime(a);
        if(result == true){
            System.out.println("Entered number is Prime");
        }else{
            System.out.println("Entered number is Not Prime");
        }       */



        /*  findPrimeInRange(a);    */


       /*    binToDec(a);   */

        /*  decToBin(a);    */


/*  FUNCTION ASSIGNMENT PRACTICE */
        /*  avgThree(a, b, c);  */

        /*  System.out.println(isEven(a));  */

        /*  isPalindrome(a);    */

        /*  sumDigits(a);    */




                                /*  ADVANCED PATTERNS */
        /*     Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int len = sc.nextInt(); 
        System.out.print("Enter width: ");   
        int wdth = sc.nextInt(); 
        hollowRectangle(len, wdth);     */


        /*  invertedHalfPyramid();      */

        /*  invertHalfStarPyramid(5);   */


        /*  Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        floydsTriangle(num);        */



        /*  invertWithNum(5);       */



        /*  Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        zeroOne(num);       */



        /*  butterfly(4);   */


        /*  solidRhombus(8);    */


        /*  hollowRhombus(5);   */


        /*  diamond(4); */

        /*  numberPyr(5);   */

        /*  palindromNum(5);    */




    }


}