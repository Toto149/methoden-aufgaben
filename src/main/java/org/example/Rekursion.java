package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rekursion {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,5,5,5,2,2,2};
        List<Integer> numberList = List.of(1,2,3,4,5,5,5,5,2,2,2);
        ArrayList<Integer> numberArrayList = new ArrayList<>(numberList);
        System.out.println(isPalindrome("MbnLnaM"));
        System.out.println(sumOfAllEvenNumbers(numberArrayList));

    }

    public static int sumOfAllEvenNumbers(ArrayList<Integer> numbers){
        if(numbers.size() == 0){
            return 0;
        }
        int num = numbers.getLast();

        numbers.removeLast();

        return  (num%2==0 ? num : 0) + sumOfAllEvenNumbers(numbers);
    }

    public static int sumOfAllEvenNumbers(int[] numbers, int n){
        if(n==0){
            return (numbers[0]%2==0 ? numbers[0] : 0);
        }

        return (numbers[n]%2==0? numbers[n]: 0) + sumOfAllEvenNumbers(numbers, n-1);
    }



    public static boolean isPalindrome(String word){
        int wordLength = word.length();
        if(wordLength <= 1) {
            return true;
        }

        char[] wordArray = word.toCharArray();
        char chStart = wordArray[0];
        char chEnd = wordArray[wordLength-1];

        wordArray[0]=' ';
        wordArray[wordLength-1] = ' ';

        word = new String(wordArray).trim();

        return chStart==chEnd && isPalindrome(word);
    }

}
