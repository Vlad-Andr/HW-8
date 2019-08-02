package com.company;

import com.company.exception.ExceptionForNullValue;
import com.company.exception.ExceptionForOddNumber;
import com.company.exception.ExceptionForPalindrome;
import com.company.server.CheckNullValue;
import com.company.server.CheckOddNumber;
import com.company.server.CheckOnPalindrome;
import com.company.exception.StackOverflowException;

public class ReliseException {
    public static void runException() throws ExceptionForPalindrome, ExceptionForOddNumber, ExceptionForNullValue {
        StackOverflowException stack = new StackOverflowException();
        stack.errorPrint(1);
        CheckOnPalindrome palindrome = new CheckOnPalindrome("");
        palindrome.checkOnPolindrome();
        CheckOddNumber number = new CheckOddNumber("");
        number.checkNumberOdd();
        CheckNullValue value = new CheckNullValue("");
        value.checkobjNULL(null);
    }
}
