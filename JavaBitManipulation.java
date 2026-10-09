public class JavaBitManipulation {

    public static void isEvenOrOdd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }


    public static int ithBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }


    public static int setithBit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }


    public static int clearithBit(int n, int i){
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }


//  used to clear i number of bits
    public static int cleariBits(int n, int i){
        int bitmask = -1<<i;
        return n&bitmask;
    }


    public static void main(String args[]){
        /*  isEvenOrOdd(2);
        isEvenOrOdd(19);        */


        /*  System.out.print(ithBit(5, 3));     */


       /*    System.out.print(setithBit(6,3));     */

       /*   System.out.println(clearithBit(10,1));      */

        /*  System.out.println(cleariBits(15,2));       */

    }

}