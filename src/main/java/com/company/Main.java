package com.company;

import com.company.exception.ExceptionForNullValue;
import com.company.exception.ExceptionForOddNumber;
import com.company.exception.ExceptionForPalindrome;

public class Main {

    public static void main(String[] args) throws ExceptionForPalindrome, ExceptionForOddNumber, ExceptionForNullValue {
        ReliseException.runException();
    }
}
