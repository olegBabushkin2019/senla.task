package orel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {

        int number, count;

        //input and read number from the console
        System.out.format("Input number >= 1 and <= %d \n", Integer.MAX_VALUE);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            number = Integer.parseInt(br.readLine());
        }

        System.out.format("Prime numbers from 1 to %d are: \n", number);

        //output prime numbers in the console
        for (int i = 1; i <= number; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(i + " ");
        }
    }
}
