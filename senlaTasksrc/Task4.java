package orel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task4 {
    public static void main(String[] args) throws IOException {
        int count1 = 0, count2 = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            while (count1 != 4) {

                if (Boolean.parseBoolean(reader.readLine()) == Boolean.TRUE) {
                    count2++;
                }

               /* if (reader.readLine().toString().compareToIgnoreCase("true")==0){
                    count2++;
                }*/

                count1++;
            }

            if (count2 == 2)
                System.out.println("True");
            else
                System.out.println("NotTrue");
        }
    }
}
