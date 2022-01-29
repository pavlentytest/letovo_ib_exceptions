package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        ArrayList<Integer> a = new ArrayList<>(n);
        String[] a_ = scanner.nextLine().split(" ");
        for(int i=0;i<a_.length;i++) {
            a.add(Integer.parseInt(a_[i]));
        }


        // Collection
        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        String test = names.get(0);
        for(String s: names) {
            System.out.println(s);
        }

        Collections.binarySearch(names,"Ivan");

        Collections.sort(names);

        //Arrays.binarySearch()
        //Arrays.sort()

        //Vector


        /*
        ECar tesla = new ECar("Tesla");
        ECar leaf = new ECar("Nissan");
        */

        // Exceptions
        /*
        int z;
        try {
            int x = 100;
            int y = 0;
            z = x / y;
            int[] c = new int[2];
            c[10] = 100;
            // не выполняется
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
        System.out.println("Hello!");
       // System.out.println("z="+z);

         */

    }
}
