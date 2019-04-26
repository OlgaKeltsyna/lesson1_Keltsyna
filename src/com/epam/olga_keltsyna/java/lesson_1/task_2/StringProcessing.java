package com.epam.olga_keltsyna.java.lesson_1.task_2;
import java.util.Scanner;

public class StringProcessing {
    private int stringCount;
    private String[] stringArray;
    Scanner scanner = new Scanner(System.in);
    static final String ENTER_STRING = "Please, enter string:";

    public StringProcessing(int stringCount) {
        this.stringCount = stringCount;
        this.stringArray = readString();
        System.out.println(printLessAverageString(this.stringArray));
    }

    public String[] readString() {
        String[] stringArray = new String[this.stringCount];
        int enterString = 0;

        while (this.stringCount != enterString) {
            System.out.println(ENTER_STRING);
            stringArray[enterString] =  scanner.next();
            enterString++;
        }
        return stringArray;
    }
    public double getAverageLength(String[] stringArray) {
        int sumArray = 0;
        for (String value : stringArray)
            sumArray += value.length();
        return (double)sumArray / stringCount;
    }

    public String printLessAverageString(String[] stringArray) {

        double averageLength = getAverageLength(stringArray);
        String lessAverageString = "Average length: " + averageLength + "\n";
        lessAverageString += "Strings that are shorter than average length" + "\n";
        for (String value : stringArray)
            if (value.length() < averageLength) lessAverageString += "String: " + value
                    + " " + "Length: " + value.length() + "\n";
        return lessAverageString;
    }
}
