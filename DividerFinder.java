package Garbage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Java on 07.02.2016.
 */
public class DividerFinder {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Please input number : ");
            int number = Integer.parseInt(reader.readLine());
            ArrayList<Integer> dividerList = new ArrayList<>();

            for (int i = number; i > 0 ; i--) {

               if (number % i == 0) {

                   dividerList.add(i);
               }
            }

            System.out.println("List of integer dividers");

            for (Integer i: dividerList) {

                System.out.print(i + " ");
            }
        }
        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
