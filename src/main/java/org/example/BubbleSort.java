package org.example;

public class BubbleSort {


    public static void main(String[] args) {
        int[] numbers = {1,34,5,16,17,42,-3};
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        numbers = bubbleSort(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }


    public static int[] bubbleSort(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]>numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
