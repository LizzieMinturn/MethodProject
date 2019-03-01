package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declare
        Scanner keyboard;
        String name;

        //initialize
        keyboard = new Scanner(System.in);

        printGreeting("world");
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        System.out.println(helloName(name));
        int a = 5;
        int b = 7;
        System.out.println("5*7 is " + multiply(a,b));
        int c = 15;
        int d = 3;
        System.out.println("15/3 is " + divide(c,d));
        max(a,b);
        min(a,b);
        Switch("hello", "world");

        }

        public static void printGreeting(String word){

        System.out.println("hello " + word);
        }

        public static String helloName(String name){

        return"hello "+ name;
        }

        public static int multiply(int firstNumber, int secondNumber){

        return firstNumber*secondNumber;
        }

        public static int divide(int firstNumber, int secondNumber){

        return firstNumber/secondNumber;
        }

        public static void max(int a, int b){

        System.out.println(Math.max(a,b));
        }

        public static void min(int a, int b){

        System.out.println(Math.min(a,b));
        }

        public static void Switch(String wordA, String wordB){

        System.out.println(wordB+" "+wordA);
        }

    }

