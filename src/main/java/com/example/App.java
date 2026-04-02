package com.example;

public class App {
    
    
    public String checkEvenOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }


    public int sumOfDigits(int number) {
        int sum = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

  
    public int reverseNumber(int number) {
        int reverse = 0;
        int sign = number < 0 ? -1 : 1;
        int temp = Math.abs(number);
        while (temp > 0) {
            reverse = reverse * 10 + (temp % 10);
            temp /= 10;
        }
        return reverse * sign;
    }

    public static void main(String[] args) {
        App app = new App();
        int num = 12345;
        System.out.println("Number: " + num);
        System.out.println("Type: " + app.checkEvenOdd(num));
        System.out.println("Sum of Digits: " + app.sumOfDigits(num));
        System.out.println("Reverse: " + app.reverseNumber(num));
    }
}
