package com.company.exception;

public class StackOverflowException {
    public void errorPrint(int num) {
        try {
            System.out.println("Number: " + num);
            if (num == 0) return;
            else errorPrint(++num);
        } catch (StackOverflowError e) {
            System.out.println("\n Error : " + e + "\n");
        }
    }
}
