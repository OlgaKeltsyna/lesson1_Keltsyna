package com.epam.olga_keltsyna.java.lesson_1.task_2;

import java.util.Scanner;

// Variant 3
public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter string count: ");
        int stringCount =  Integer.parseInt(scanner.next());
        StringProcessing stringProcessing = new StringProcessing(stringCount);
    }

}
