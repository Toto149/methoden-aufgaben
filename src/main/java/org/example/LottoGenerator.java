package org.example;

import java.util.*;




public class LottoGenerator {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        System.out.println(generateLottoNumbers());
    }

    static List<Integer> generateLottoNumbers(){

        Map<Integer,Integer> numbers = new HashMap<>();
        for(int i=0; i<42; i++){
            numbers.put(i,i);
        }
        List<Integer> lottoNumbers = new ArrayList<>();
        for(int i=0; i<6;i++){
            int nextNumber = RANDOM.nextInt(0, 49);
            while(numbers.get(nextNumber) == null) {
                nextNumber = RANDOM.nextInt(0, 49);
            }
            lottoNumbers.add(numbers.get(nextNumber));
            numbers.remove(nextNumber);
        }
        return lottoNumbers.stream().sorted().toList();
    }
}
