package org.yup;

public class javaChallengesApp {


    public static void main(String[] args){
        Challenges challenges = new Challenges();

        String greeting = challenges.greeting("rial", 21);

        System.out.println(greeting);

        String greetingWithUserInput= challenges.greetingWithUserInput();

        System.out.println(greetingWithUserInput);

        int addTwoNumbers
                =challenges.addTwoNumbers();
        System.out.println(addTwoNumbers);

        int subtractTwoNumbers
                =challenges.subtractTwoNumbers();
        System.out.println(subtractTwoNumbers);

        int multiplyTwoNumbers
                =challenges.multiplyTwoNumbers();
        System.out.println(multiplyTwoNumbers);

    }
}
