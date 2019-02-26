package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //4)same but divides 5)method that finds the max double between numbers 6)switch words

        //declare
        Scanner keyboard;
        String name;
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

        }

        public static void printGreeting(String word){

        System.out.println("hello " + word);
        }

        public static String helloName(String name){
        System.out.println("hello " + name);
        return name;
        }

        public static int multiply(int firstNumber, int secondNumber){
        int answer = firstNumber*secondNumber;
        return answer;
        }

    public static int divide(int firstNumber, int secondNumber){
        int answer = firstNumber/secondNumber;
        return answer;
        }

    }

