package orel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        String message;
        boolean flag = true;

        //input and read string
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Input message");
            message = br.readLine();
        }

        char[] array = message.toCharArray();
        char[] arrayWithoutDigital = new char[array.length];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (!Character.isDigit(array[i]))
                arrayWithoutDigital[j] = array[i];
            else j--; // for input message without space
        }

        System.out.println("Message without digital: \n" + String.copyValueOf(arrayWithoutDigital));
    }
}
