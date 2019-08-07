import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

package com.company;



public class CommandLineGram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name");
        String firstName = scan.nextLine();

        System.out.println("hello, " + firstName);

        System.out.println( firstName + ", what is your last name?");
        String lastName = scan.nextLine();

        System.out.println("thanks for that" +  "," + firstName + + lastName + "What is your email address ");
        String emailAddress = scan.nextLine();

        System.out.println("thank you ! ! !" + emailAddress);

        System.out.println("What is your twitter handle");
        String twitterName = scan.nextLine();

        System.out.println(twitterName + "sounds like a awesome handle");

        System.out.println( "How old are you?");
        int userAge = Integer.parseInt(scan.nextLine());

        System.out.println(" you look amazing! ! !");

        System.out.println("What country are you from?");
        String countryOrgin = scan.nextLine();

        System.out.println("so you're from" + " " + countryOrgin);

        System.out.println("What is your career path");
        String careerPath = scan.nextLine();

        System.out.println(careerPath + " sounds like very fufilling work");

        System.out.println("What is your favorite operating system?");
        String favoriteOs = scan.nextLine();

        System.out.println( "I also like to use " + favoriteOs);

        System.out.println("What is your favorite language");
        String favoriteLanguage = scan.nextLine();

        System.out.println(favoriteLanguage + "can be tough but rewarding");

        System.out.println("Who is your favorite computer engineer");
        String favoritEngineer = scan.nextLine();

        System.out.println(favoritEngineer +  "Is also my favorite engineer");

        System.out.println("have you ever built your own computer?");
        String questionOne = scan.nextLine();










        int sum = num1 + num2;

        System.out.println("the sum of your number is " + sum);


    }
}
