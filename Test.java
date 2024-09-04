import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // Scanner ka object ,class predefined jo import kr rhe h
        System.out.println("Enter aryan age:");
        int age= sc.nextInt();  // input de rha user
        Aryan aryan=new Aryan();  // class Aryan access kr rhe h yaha pr object bna ke
        System.out.println("age:-"+ aryan.weight(age));
    }
}
/*
 Piller of oops :

   1. Inheritance  -  Parent --> child
   2. Abstraction  - Hiding necessary details' ex: ATM
   3. Encapsulation -
   4. Polymorphism  - Run time polymorphism -> Method overriding
                      compile time polymorphism -> Method Overloading

   Class  ->  BluePrint of object
   Object ->  new instance --> Memory allocation after creation of  object

   constructor  -->





 */
