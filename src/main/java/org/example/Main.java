package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        taskOne();
        System.out.println();
        taskTwo();
    }
    public static void taskOne() {
        PrimeNumbers primenumbers = new PrimeNumbers();
        primenumbers.printPrimesLessThan(100);
    }
    public static void taskTwo() {
        Palindrome palindromeCheck = new Palindrome();
        palindromeCheck.isPalindrome("шалаш");
        palindromeCheck.isPalindrome("СоБАКа");
        palindromeCheck.isPalindrome("ДовОд");
        palindromeCheck.isPalindrome("ЗемЛЯ");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите слово - ");
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            }
            else {
                palindromeCheck.isPalindrome(text);
            }
        }
    }
}
