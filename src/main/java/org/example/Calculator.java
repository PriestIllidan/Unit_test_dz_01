package org.example;

//*Задание 1. * В классе Calculator создайте метод calculateDiscount,
// который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
// Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
// Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
// Не забудьте написать тесты для проверки этого поведения.

public class Calculator {
    public static void main(String[] args) {
        System.out.printf("Сумма после скидки : %s\n", calculateDiscount(100, 0.5));
//        System.out.printf("Сумма после скидки : %s\n", calculateDiscount(0, 0.5));
        System.out.printf("Сумма после скидки : %s\n", calculateDiscount(3, 0));
    }

    public static double calculateDiscount(double sum, double discount) {
        if (sum <= 0 | discount <= 0 | discount >= 1) {
            throw new ArithmeticException("Invalid values entered");
        } else {
            return sum * discount;
        }
    }
}