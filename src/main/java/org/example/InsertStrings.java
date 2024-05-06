package org.example;

public class InsertStrings {

    public static void main(String[] args) {
        System.out.println(insertString("Hallo", "Java", 1));
    }

    public static String insertString(String input, String toInsert, int position){
        StringBuilder str = new StringBuilder();
        char[] chars = input.toCharArray();

        for(int i = 0; i<chars.length; i++){
            if(i == position){
                str.append(toInsert);
            }
            else{
                str.append(chars[i]);
            }
        }
        return str.toString();

    }
}
