package com.company;
import com.company.exception.PalindromeException;
import com.company.exception.OddNumberException;
import com.company.server.CheckNullValue;
import com.company.server.CheckOddNumber;
import com.company.server.CheckOnPalindrome;
import com.company.exception.StackOverflowException;

public class ReliseException {
    public static void runException() throws PalindromeException, OddNumberException {
        StackOverflowException stack = new StackOverflowException();
        stack.errorPrint(1);
        CheckOnPalindrome palindrome = new CheckOnPalindrome("");
        palindrome.checkOnPolindrome();
        CheckOddNumber number = new CheckOddNumber("");
        number.checkNumberOdd(22);
        CheckNullValue value = new CheckNullValue();
        value.checkOnNull(null);
    }
}
