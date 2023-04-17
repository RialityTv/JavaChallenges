package org.yup;
import java.util.Scanner;
public class Challenges {
    public String greeting(String name, int age) {
        if (age >= 21) {
            return "hello, " + name + " welcome to the party";


        } else {
            return "hello, " + name + ", I am sorry but we cannot let you into the party";


        }
    }

    public String greetingWithUserInput() {
        Scanner theScanner = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = theScanner.nextLine();
        System.out.print("Enter your age: ");
        int age = theScanner.nextInt();

        if (age >= 21) {
            return "hello, " + name + " welcome to the party";


        } else {
            return "hello, " + name + ", I am sorry but we cannot let you into the party";


        }
    }
    public int addTwoNumbers(){
        Scanner theScanner = new Scanner(System.in);

        System.out.print("enter number 1 ");
        int number1 = theScanner.nextInt();
        System.out.print("Enter number 2");
        int number2 = theScanner.nextInt();
        return number1 + number2;

    }
    public int subtractTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);

        System.out.print("enter number 1 ");
        int number1 = theScanner.nextInt();
        System.out.print("Enter number 2");
        int number2 = theScanner.nextInt();
        return number1 - number2;
    }

    public int multiplyTwoNumbers(){
        Scanner theScanner = new Scanner(System.in);
        System.out.println("enter number 1");
        int number1 = theScanner.nextInt();
        System.out.println("enter number 2");
        int number2 = theScanner.nextInt();
        return number1 * number2;
    }

        //create a method like the above for subtractTwoNumbers multiply 2 numbers
}
