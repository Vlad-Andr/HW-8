package com.company.exception;

public class StackOverflowException {
    public void errorPrint(int num) {

       try {
           errorPrint(++num);
        } catch (StackOverflowError e) {
            System.out.println("\n Error : " + e + "\n");
        }
    }
}
