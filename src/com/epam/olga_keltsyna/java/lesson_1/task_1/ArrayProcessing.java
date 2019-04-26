package com.epam.olga_keltsyna.java.lesson_1.task_1;

public class ArrayProcessing {
    private int[] array;
    static final int ARRAY_COUNT = 20;
    static final String SOURCE_ARRAY_STRING = "Source array:";
    static final String FINAL_ARRAY_STRING = "Final array:";

    public ArrayProcessing() {
        this.array = generateArray(this.array);
        System.out.println(printArray(this.array, SOURCE_ARRAY_STRING));
        this.array = replaceNegative(this.array);
        System.out.println(printArray(this.array, FINAL_ARRAY_STRING));
    }

    public int[] generateArray(int[] array) {
        array = new int[ARRAY_COUNT];
        for (int i = 0; i < ARRAY_COUNT; i++)
            array[i] = ((int)(Math.random() * 20 ) - 10);
        return array;
    }

    public int[] replaceNegative(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 0) array[i] = 0;
        return array;
    }

    public String printArray (int[] array, String firstString) {
        String resultString = firstString + "\n";
        for (int value : array)
            resultString = resultString + value + "\n";
        return resultString;
    }
}
