package org.example;

public class Palindrome {
    public void isPalindrome(String str) {

        if (str == null) {
            System.out.println("Введено пустое значение");
        }

        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        if (cleanedStr.equals(reversedStr)) {
            System.out.println(str +" - Палиндром");
        }
        else {
            System.out.println(str +" - Не палиндром");
        }
    }
}
