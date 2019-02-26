package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //5)method that finds the max double between numbers 6)switch words

        //declare
        Scanner keyboard;
        String name;
        String wordA;
        String wordB;

        //initialize
        keyboard = new Scanner(System.in);

        printGreeting("world");
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        helloName(name);
        int a = 5;
        int b = 7;
        System.out.println("5*7 is " + multiply(a,b));
        int c = 15;
        int d = 3;
        System.out.println("15/3 is " + divide(c,d));
        wordA = "hello";
        wordB = "world";
        Switch(wordA,wordB);

        }

        public static void printGreeting(String word){
        System.out.println("hello " + word);
        }

        public static String helloName(String name){
        System.out.println("hello " + name);
        return name;
        }

        public static int multiply(int firstNumber, int secondNumber){
        return firstNumber*secondNumber;
        }

    public static int divide(int firstNumber, int secondNumber){
        return firstNumber/secondNumber;
        }

        public static int max(int firstNumber, int secondNumber) {

        }

        public static void Switch(String wordA, String wordB){
        System.out.println(wordB + " " + wordA);
        }

    }

