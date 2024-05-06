package org.example;

public class Rekursion {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,5,5,5,2,2,2};
        System.out.println(isPalindrome("MbnLnaM"));
        System.out.println(sumOfAllEvenNumbers(numbers));

    }

    public static int sumOfAllEvenNumbers(int[] numbers){
        if(numbers.length == 0){
            return 0;
        }
        int num = numbers[numbers.length-1];

        int[] numbers2 = new int[numbers.length-1];
        for(int i=0; i<numbers2.length;i++){
            numbers2[i] = numbers[i];
        }

        return  (num%2==0 ? num : 0) + sumOfAllEvenNumbers(numbers2);
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
