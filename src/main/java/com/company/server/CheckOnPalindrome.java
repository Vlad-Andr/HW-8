package com.company.server;

import com.company.exception.ExceptionForPalindrome;

import java.util.Scanner;

public class CheckOnPalindrome extends ExceptionForPalindrome {
    public CheckOnPalindrome(String message) {
        super(message);
    }

    public void checkOnPolindrome() throws ExceptionForPalindrome {
        Scanner in=new Scanner(System.in);
        System.out.print("ENTER YOUR STRING: ");
        String a=in.nextLine();
        System.out.println("GIVEN STRING IS: "+a);
        StringBuffer str=new StringBuffer(a);
        StringBuffer str2=new StringBuffer(str.reverse());
        String s2=new String(str2);
        System.out.println("THE REVERSED STRING IS: "+str2);

            if (a.equals(s2)) {
                System.out.println("ITS A PALINDROME \n");
            }
            else {
                throw new ExceptionForPalindrome("Error : It`s a not palindrome");
            }
        }
    }

