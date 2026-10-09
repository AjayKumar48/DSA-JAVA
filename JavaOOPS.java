public class JavaOOPS{

    public static void main(String args[]){

        // Student s1 = new Student();
        // s1.name = "Ajay";
        // s1.roll = 123;
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 80;

        // System.out.println(s1.name);
        // System.out.println(s1.roll);
        // for(int i=0; i<3; i++){
        //     System.out.print(s1.marks[i]+" ");
        // }
        // System.out.println();


//     HYBRID INHERITANCE EXAMPLE
        // Cat c1 = new Cat();
        // c1.skinCol = "white";
        // c1.eat();
        // c1.walk();
        // System.out.println(c1.skinCol);






//  DEFAULT COPY CONSTRUCTOR  /  SHALLOW COPY CONSTRUCTOR 
        // Student s2 = new Student(s1);
        // System.out.println(s2.name);
        // System.out.println(s2.roll);
        // s1.marks[2] = 30;
        // for(int i=0; i<3; i++){
        //     System.out.print(s2.marks[i]+" ");
        // }
        // System.out.println();



//      DEEP COPY CONSTRUCTOR   
    // Student s2 = new Student(s1);
    //     System.out.println(s2.name);
    //     System.out.println(s2.roll);
    //     s1.marks[2] = 30;
    //     for(int i=0; i<3; i++){
    //         System.out.print(s2.marks[i]+" ");
    //     }
    //     System.out.println();


//      ABSTRACT CLASS
    // Horse h1 = new Horse();
    // h1.eat();
    // h1.walk();
    // System.out.println(h1.color);
    // h1.changeColor();
    // System.out.println(h1.color);


//          INTERFACES AND IT'S USE FOR APPLYING MULTIPLE INHERITANCE
    // Bear b1 = new Bear();
    // b1.type();
    // b1.eat();
    


//          STATIC KEYWORD IN JAVA
    // Stud stu1 = new Stud();
    // stu1.setName("Ajay Parashar");
    // System.out.println(stu1.getname());
    // stu1.roll = 2;
    // stu1.schoolName = "GSSS, KABLANA";
    // System.out.println(stu1.schoolName);
    // System.out.println(stu1.returnPercentage(67,45,90));


    // Stud stu2 = new Stud();
    // System.out.println(stu2.schoolName);



//          SUM,PRODUCT,DIFFERENCE OF COMPLEX NUMBERS
    // Complex c1 = new Complex(4,5);
    // Complex c2 = new Complex(9,4);
    // Complex c3 = Complex.add(c1, c2);
    // Complex c4 = Complex.product(c1, c2);
    // Complex c5 = Complex.diff(c1, c2);

    // c3.printcomplex();
    // c4.printcomplex();
    // c5.printcomplex();

    }   
}



class Student{
    int marks[];
    String name;
    int roll;


//  SHALLOW COPY CONSTRUCTOR
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }


//      DEEP COPY CONSTRUCTOR 
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     marks = new int[3];

    //     for(int i=0; i<3; i++){
    //         marks[i] = s1.marks[i];
    //     }
    // }


//     DEFAULT CONSTRUCTOR
    Student(){
        marks = new int[3];
    }
}


//           HYBRID INHERITANCE EXAMPLE
class Animal{
    String skinCol;
    void eat(){
        System.out.println("Eating");
    }
    void breath(){
        System.out.println("Breathing");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swimming");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flying");
    }
}

class Eagle extends Bird{
    void longFly(){
        System.out.println("Yes");
    }
}

class Mammle extends Animal{
    void walk(){
        System.out.println("walking");
    }
}

class Dog extends Mammle{
    int legs;
}

class Cat extends Mammle{
    void meow(){
        System.out.println("Meowwwww!");
    }
}



//      ABSTRACT CLASS
abstract class Animall {
    String color;

    Animall(){
        color = "brown";
    }

    abstract void walk();

    void eat(){
        System.out.println("Eating");
    }

}

class Horse extends Animall{

    void walk(){
        System.out.println("Walking on 4 legs");
    }

    void changeColor(){
        color = "White";
    }
}



//          INTERFACES AND IT'S USE FOR APPLYING MULTIPLE INHERITANCE   (Herbi  ,  Carni  )
//                                                                         \        /
//                                                                           Omnivore
//                                                                              |
//                                                                             Bear


interface Herbivour{
    void eat();
}

interface Carnivore{
    void eat();
}

class Omnivore implements Herbivour,Carnivore{
    public void eat(){
        System.out.println("Can eat both Grass and Meat");
    }
}

class Bear extends Omnivore{
    void type(){
        System.out.println("It is an Omnivour animal");
    }
}



//          STATIC KEYWORD IN JAVA
class Stud{
    String name;
    int roll;

    static String schoolName;

    void setName(String newName){
        name = newName;
    }

    String getname(){
        return name;
    }

    int returnPercentage(int s1, int s2, int s3){
        return (s1 + s2+ s3)/3;
    }
}



//          SUM,PRODUCT,DIFFERENCE OF COMPLEX NUMBERS
class Complex{
    int real;
    int img;

    public Complex(int r, int i){
        real = r;
        img = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real - b.real), (a.img - b.img));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real * b.real) - (a.img * b.img)) , ((a.real * b.img) - (a.img * b.real)));
    }

    void printcomplex(){
        if(real == 0 && img!=0){
            System.out.println(img +"i");
        }
        else if(img == 0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real + "+" + img + "i");
        }
    }

}