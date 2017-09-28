package com.company;

public class Main {

    public static void main(String[] args) {
        args = new String[3];
        /* for (int i = 0; i < args.length; i++){
         *    args[i] = "" + i + i + i;
         * }
         */
        args[0] = "one";
        args[1] = "two";
        args[2] = "three";
	    print(args);
        sort(args);
        print(args);
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
}
