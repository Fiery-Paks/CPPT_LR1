package org.example;

public class PrimeNumbers {

    public void printPrimesLessThan(int n) {
        System.out.println("Простые числа меньше " + n + ":");

        for (int number = 0; number < n; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        // Проверка нечетных делителей
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}