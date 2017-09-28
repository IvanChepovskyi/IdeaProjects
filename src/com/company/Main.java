package com.company;

public class Main {

    public static void main(String[] args) {
        /* args = new String[3];
         * for (int i = 0; i < args.length; i++){
         *    args[i] = "" + i + i + i;
         * }
         *
         * args[0] = "one";
         * args[1] = "two";
         * args[2] = "three";
	     * print(args);
         * sort(args);
         * print(args);
         */
        System.out.println(power(2, 10));
        System.out.println(factorial(10));
    }

    public static void print(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void sort(String[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].compareTo(args[i + 1]) > 0) {
                String tmp = args[i + 1];
                args[i + 1] = args[i];
                args[i] = tmp;
            }
        }
    }

    public static int power(int base, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return base * power(base, pow - 1);
        }
    }

    public static int factorial(int base) {
        if (base == 0) {
            return 1;
        } else {
            return base * factorial(base - 1);
        }
    }
}
