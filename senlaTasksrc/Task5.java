package orel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {

        String word;


        //input and read string
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Input word");
            word = br.readLine();
        }
        StringBuilder wordReverse = new StringBuilder(word).reverse();

        if (wordReverse.toString().compareToIgnoreCase(word.toString()) == 0)
            System.out.println("Word is a palindrom");
        else
            System.out.println("Word is NOT a palindrom");
    }
    // without case
      /*  boolean flag = true;
        for (int i = 0; i < word.length()/2; i++) {
            if (!(word.charAt(i)==word.charAt(word.length()-1-i))){
                System.out.println("Word is NOT a palindrom");
                flag=false;
                return;
            }
        }
        if (flag==true)
            System.out.println("Word is a palindrom");*/
}

