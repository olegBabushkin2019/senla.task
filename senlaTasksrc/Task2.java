package orel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        long numbersFib;
        long data;

        //input and read number in variable from the console
        System.out.println("Input positive number");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            data = Long.parseLong(br.readLine());
        }

        // for upper limit of number in sequence
        int i = 1;
        while (true) {
            numbersFib = fib(i);
            if (numbersFib > data)
                return;
            System.out.print(numbersFib + " ");
            i++;
        }

        // for amount of numbers in sequence
        /*for (int i = 0; i < data ; i++) {
            numbersFib = fib(i);
            System.out.print(numbersFib + " ");
        }*/
    }

    //finding the Fibonacci numbers
    private static int fib(int k) {
        if (k == 0) {
            return 0;
        }
        if (k == 1) {
            return 1;
        } else
            return fib(k - 1) + fib(k - 2);
    }

}

