package com.epam.olga_keltsyna.java.lesson_1.task_3;

import java.util.Scanner;

public class Calculator {

    private int firstNumber = 0;
    private int secondNumber = 0;
    Scanner scanner = new Scanner(System.in);

    public Calculator() {
        printEnterNumber();
        int value = printMenu();
        switch(value) {
            case 1:
                System.out.println("Addition result: "
                        + getAddition(this.firstNumber, this.secondNumber));
                break;
            case 2:
                System.out.println("Difference result: "
                        + getDifference(this.firstNumber, this.secondNumber));
                break;
            case 3:
                System.out.println("Multiplication result: "
                        + getMultiplication(this.firstNumber, this.secondNumber));
                break;
            case 4:
                System.out.println("Division result: "
                        + getDivision(this.firstNumber, this.secondNumber));
                break;
            default:
                break;
        }
    }

    public int getAddition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int getDifference(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int getMultiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int getDivision(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int printMenu(){
        System.out.println("Please, choose: " + "\n"
                + "1. Addition" + "\n"
                + "2. Difference" + "\n"
                + "3. Multiplication" + "\n"
                + "4. Division" + "\n" + "\n"
                + "Enter any button to exit..." + "\n");
        return Integer.parseInt(scanner.next());
    }

    public void printEnterNumber(){
        System.out.println("First number: ");
        this.firstNumber = Integer.parseInt(scanner.next());
        System.out.println("Second number: ");
        this.secondNumber = Integer.parseInt(scanner.next());
    }
}
