import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        // int a=5;
        // int b = 3;
        // int sum = a+b;
        // System.out.println(sum);

        // Sum 
        // Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();
        // int input2 = sc.nextInt();
        // int sum = input + input2;
        // System.out.print("Your required sum is : " + sum);


        // Area of circle
        // Scanner sc = new Scanner(System.in);
        // float radius = sc.nextFloat();
        // float area = 3.14f * radius * radius;
        // System.out.print("Area of the given circle is : " + area);


        // type conversion
        // float b = 2.999f;
        // char e = 'e';
        // int a = (int) b;
        // int val = (int) e;
        // System.out.println(a);
        // System.out.print(val);

        // Type promotion:- 
        //  rule 1
        // byte a = 2;
        // short b = 5;
        // char c = 'c';
        // System.out.println((int) (c));
        // int d = a+b+c;
        // System.out.println(d);

        //  rule 2
        // int a = 2;
        // float b = 5.4f;
        // long c = 245;
        // double d = 2.14;
        // double val = a+b+c+d;
        // System.out.println(val);

        // example of type conversion
        // byte a = 3;
        // byte b = (byte) (a*2) ;
        // System.out.println(b);

// Assignment question 1
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // float avg = (a+b+c)/3;
        // System.out.print("The average of the given numbers is: " + avg);


// Assignment question 2
        // Scanner sc = new Scanner(System.in);
        // float side = sc.nextFloat();
        // float area = side*side;
        // System.out.print("The area of given square is: " + area);


// Assignment question 3
        // Scanner sc = new Scanner(System.in);
        // float pencil = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // float sharpner = sc.nextFloat();
        // float total = pencil + eraser + sharpner;
        // System.out.print("The total bill without GST is : " + total);
        // float totalWithGST = total + (0.18f * total);
        // System.out.print("The total bill with GST is : "+ totalWithGST);



// Assignment question 4 :- No error is poduced in the below written line
        // int $ = 5;
        // System.out.print($);


        /* CONDITIONAL STATEMENTS */

        // Finding Greater Number
        // int a = 3;
        // int b = 10;
        // if(a > b){
        //         System.out.println("A is larger than B");
        // }else{
        //         System.out.println("B is larger");
        // }

        //  Find even or odd
        // Scanner sc = new Scanner(System.in);
        // int inp = sc.nextInt();
        // if(inp % 2 == 0){
        //         System.out.println("The given number is even");
        // }
        // else{
        //         System.out.println("The given number is odd");
        // }


        //  Income Tax Calculator
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();  
        // int tax = 0;
        // if(income <= 500000 ) {
        //         System.out.println("You have to pay tax of 0%");
        // } 
        // else if(income >= 500000 && income <= 1000000) {
        //         System.out.println("You have to pay tax of 20% Rs." + (0.2f * income));
        // }   
        // else if(income >= 1000000) {
        //         System.out.println("You have to pay tax of 30% Rs." + (0.3f * income));
        // }   


        // Print largest of 3 numbers
        // int a = 23;
        // int b = 100;
        // int c = 14;
        // if(a >= b && a>=c){
        //         System.out.println("A is largest");
        // }else if(b>=c){
        //         System.out.println("B is largest");
        // }else{
        //      System.out.println("C is largest");   
        // }



        // Trenary Operator
        // int num = 2;
        // String res = num%2==0?"Even":"Odd";
        // System.out.println(res);

        //  Student pass or fail
        // Scanner sc = new Scanner(System.in);
        // int marks = sc.nextInt();
        // String res = marks>=33?"Pass":"Fail";
        // System.out.println(res);

        // Switch Statements
        // char ch = '1';
        // switch (ch){
        //         case 'a' : System.out.println("A for Apple");
        //         break;
        //         case 'b' : System.out.println("B for Boy");
        //         break;
        //         case 'c' : System.out.println("C for cat");
        //         break;
        //         case 'd' : System.out.println("D for Dog");
        //         break;
        //         case 'e' : System.out.println("E for Elephant");
        //         break;
        //         default: System.out.println("This character isn't feeded to the system");
        // }



        //  Calculator Building using switch
//        Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         char symbol = sc.next().charAt(0);
//         switch(symbol){
//                 case '+' : System.out.println("The calculated value by the system is: " + (num1+num2));
//                 break;
//                 case '-' : System.out.println("The calculated value by the system is: " + (num1-num2));
//                 break;
//                 case '*' : System.out.println("The calculated value by the system is: " + (num1*num2));
//                 break;
//                 case '/' : System.out.println("The calculated value by the system is: " + (num1/num2));
//                 break;
//                 case '%' : System.out.println("The calculated value by the system is: " + (num1%num2));
//                 break;
//                 default: System.out.println("This character isn't feeded to the system");
//         }


/*  CONDITIONAL STATEMENTS QUESTIONS  */
        // Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative. 
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num > 0){
        //         System.out.println("The entered number is Positive");
        // }else{
        //         System.out.println("The entered number is Negative");
        // }


        // Question 2 : Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever. 
        // public class Solution { 
        //         public static void main(String[] args) { 
        //                 double temp = 103.5;
        //                 if( temp > 100) {
        //                         System.out.println("You have fever");
        //                 }else{
        //                         System.out.println("You din't have fever");
        //                 }
        //         } 
        // } 


        // Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case. 
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // switch(num){
        //         case 1: System.out.println("Monday");
        //         break;
        //         case 2: System.out.println("Tuesday");
        //         break;
        //         case 3: System.out.println("Wednesday");
        //         break;
        //         case 4: System.out.println("Thrusday");
        //         break;
        //         case 5: System.out.println("Friday");
        //         break;
        //         case 6: System.out.println("Saturday");
        //         break;
        //         case 7: System.out.println("Sunday");
        //         break;
        //         default: System.out.println("No valid day of week");
        // }


        // Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not. 
        // Scanner sc = new Scanner(System.in);
        // int year = sc.nextInt();
        // if(year % 4 == 0 || year % 100 == 0 || year % 400 == 0){
        //         System.out.println("it's a leap year");
        // }else{
        //         System.out.println("Not a leap year");
        // }


                                /* LOOPS */
        //  while loop
        // int count = 1;
        // while(count <=10){
        //         System.out.println("Hello world!" + count);
        //         count ++;
        // }


        //  Printing no. from 1 to 10
        // int counter = 1;
        // while(counter<=10){
        //         System.out.print(counter);
        //         counter ++;
        // }


        //  Printing no. from 1 to n
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 1;
        // while(counter<=range){
        //         System.out.print(counter + " ");
        //         counter ++;
        // }


        //  Printing sum of  no. from 1 to n
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while(i<=range){
        //         sum += i;
        //         i ++;
        // }
        // System.out.print("Total sum is: " + sum);




        //  Finding number prime or not
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number : ");
        // int num = sc.nextInt();
        // boolean isPrime = true;
        // if(num == 2){
        //         System.out.print("Entered number is Prime");
        // }else{
        //         for(int i=2; i<=Math.sqrt(num); i++){
        //                 if(num % i == 0){
        //                         isPrime = false;
        //                 }
        //         }
        //         if(isPrime == true){
        //                 System.out.print("Entered number is Prime");
        //         }else{
        //                 System.out.print("Entered number is not Prime");
        //         }
        // }





                /*FOR LOOP*/
        //   PRINTING SQUARE PATTERN 
        // for(int i=1;i<=4;i++){
        //         System.out.println("****");
        // }



        //  Printing reverse of a number Using for loop
        // int number = 321;
        // for(int i=0;i<3; i++){
        //         int digit = number%10;
        //         System.out.print(digit + " ");
        //         number = number / 10;
        // }



        //  Printing reverse of a number Using while loop
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();  
        // while(number > 0){
        //         int digit = number % 10;
        //         System.out.print(digit + " ");
        //         number = number / 10;
        // }


        //  Reverse the given number 
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt(); 
        // int reverse = 0;
        // while(number > 0){
        //         int digit = number % 10;
        //         reverse = (reverse*10) + digit;
        //         number = number / 10;
        // }
        // number = reverse;
        // System.out.print(number);




        /* BREAK STATEMENT */

        // keep entering the number until user enter multiple of 10
        // Scanner sc = new Scanner(System.in);
        // for(int i=1; i>0; i++){
        //         int number = sc.nextInt(); 
        //         if(number % 10 == 0){
        //                 break;
        //         }
        // }
        // System.out.print("You entered a number which is divisible by 10");




        /* CONTINUE STATEMENT */

        // skip printing the number when user enter multiple of 10
        // Scanner sc = new Scanner(System.in);
        // for(int i=1; i>0; i++){
        //         System.out.print("Enter number: ");
        //         int number = sc.nextInt(); 
        //         if(number % 10 == 0){
        //                 System.out.println("You entered multiple of 10");
        //                 continue;
        //         }
        //         System.out.println(number);
        // }


/* Question 1 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers. */
        // Scanner sc = new Scanner(System.in);
        // int evenSum = 0;
        // int oddSum = 0;
        // int choice;
        // do{
        // System.out.print("Enter number: ");
        // int number = sc.nextInt();

        // if( number % 2 == 0){
        //         evenSum += number;
        // }else{
        //         oddSum += number;
        // }

        // System.out.print("Enter 0 if want to exit.");
        // System.out.print("Enter choice here: ");
        // choice = sc.nextInt();

        // }
        // while(choice == 1);
        // System.out.println("sum of all entered even numbers is : " + evenSum);
        // System.out.println("sum of all entered odd numbers is : " + oddSum);




// Question 2 : Write a program to find the factorial of any number entered by the user. 
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int fact = 1;
        // for(int i=1; i<=num; i++){
        //         fact = fact*i;
        // }
        // System.out.println(fact);
 



// Question 3 : Write a program to print the multiplication table of a number N, entered by the user. 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int num = sc.nextInt();  
        // for(int i=1; i<=10; i++){
        //         System.out.println(num*i);
        // }



/* NESTED LOOPS AND PATTERNS */
// Triangle Star pattern 
        // for(int i=1; i<=4; i++){
        //         for(int j=0; j<i; j++){
        //                 System.out.print("* ");
        //         }
        //                 System.out.println();
        // }



// Inverted Triangle Star pattern 
        // for(int i=4; i>=1; i--){
        //         for(int j=0; j<i; j++){
        //                 System.out.print("* ");
        //         }
        //                 System.out.println();
        // }


// Half Pyramid pattern 
        // for(int i=1; i<=4; i++){
        //         for(int j=1; j<=i; j++){
        //                 System.out.print(j);
        //         }
        //                 System.out.println();
        // }



// Character Pattern
        // char ch = 'A';
        // for(int i=1; i<=4; i++){
        //         for(int j=1; j<=i; j++){
        //                 System.out.print(ch);
        //                 ch++;
        //         }
        //         System.out.println();
        // }










            }
        }
