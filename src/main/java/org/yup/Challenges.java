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

        System.out.print("enter number 1");
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

    public int interactiveCalculator (){
        Scanner theScanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator");
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.println("Enter your selection and press enter");
        int userSelection = theScanner.nextInt();

        int result;

        switch(userSelection){
            case 1:
                result = this.addTwoNumbers();

                //add here
                break;
            case 2:
                result = this.subtractTwoNumbers();
                // subtract here
                break;
            case 3:
                result = this.multiplyTwoNumbers();
                //multiply here
                break;
            default:
                System.out.println("the user chose nonsense");
                return 0;

        }
        return result;
    }
    public String coinFlip() {

        //attempt to flip a coin
        //return heads or tails

        //this is where we flip the coin
        if (Math.random() > .5) {
            //here is where we return heads in the number generated was > .5
            return "heads";
        } else {
            //there is where we return if the number generated was less than .5
            return "tails";
        }
    }

    public String findTheBiggestNumber(){

        //this is the scanner that lets us take input from the user
        Scanner theScanner  = new Scanner(System.in);

        //this is where we ask the user for input
        System.out.print("Give me the first number please:");
        //this is where we capture that input and store it in a variable called firstNumber
        int firstNumber = theScanner.nextInt();

        //this is where we ask the user for input
        System.out.print("Now give me the second number please:");
        //this is where we capture that input and store it in a variable called secondNumber
        int secondNumber = theScanner.nextInt();

        int theBiggestNumber = Math.max(firstNumber, secondNumber);

        return "The biggest number between " + firstNumber + " and " + secondNumber + " is: " + theBiggestNumber;

    }

    public String findSmallestNumber(){

        //reference the above method to make one that finds the smaller two numbers
        Scanner theScanner  = new Scanner(System.in);
        System.out.println("give me the first number");
        int firstNumber = theScanner.nextInt();
        System.out.println("give me the second number");
        int secondNumber = theScanner.nextInt();

        int theSmallOne = Math.min(firstNumber, secondNumber);

        return "The smallest number between" + firstNumber + " and " + secondNumber + " is: " + theSmallOne;

    }

    public String findTheDifferenceBetweenTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);

        System.out.println("Enter the 1st Number: ");
        int firstNumber = theScanner.nextInt();

        System.out.println("Enter the 2nd number: ");
        int secondNumber = theScanner.nextInt();

        int difference = firstNumber - secondNumber;


        int theAnswer = Math.abs(difference);


        return "the difference between " + firstNumber + " and " + secondNumber + "is: " + theAnswer;
    }



    }


