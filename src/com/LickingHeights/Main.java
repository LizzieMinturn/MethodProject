package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1)prints hello world 2)returns hello with a name they type 3)multiplies
        //and returns two numbers 4)same but divides 5)method that finds the max
        //double between numbers 6)switch words

        //declare
        Scanner keyboard;
        String name;
        //initialize
        keyboard = new Scanner(System.in);

        printGreeting("world");
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        helloName(name);


        }

        public static void printGreeting(String word){
            System.out.println("hello " + word);
        }

        public static void helloName(String name){
            System.out.println("hello " + name);
        }



    }

